<template>
  <div>
    <div style="margin-top: 15px;">
      <el-row>
        <el-col :span="2">
          <el-button type="info" @click="export2Excel">下载</el-button>
        </el-col>
        <el-col :span="1">
          <el-input class="input-with-select">
            <el-select v-model="search.deptId" style="width:200px" slot="prepend" placeholder="请选择部门">
              <el-option
                v-for="(item,index) in deptData.list"
                :key="index"
                :label=item.deptName
                :value="item.dId"
              ></el-option>
            </el-select>
            <el-date-picker
              slot="append"
              value-format="yyyy-MM-dd"
              v-model="search.createData"
              type="date"
              placeholder="选择开始日期"
            ></el-date-picker>
            <el-date-picker
              slot="append"
              value-format="yyyy-MM-dd"
              v-model="search.createDataSearch"
              type="date"
              placeholder="选择结束日期"
            ></el-date-picker>
            <el-button slot="append" icon="el-icon-search" @click="findData"></el-button>
          </el-input>
        </el-col>
      </el-row>
    </div>
    <el-table :data="tableData.list" border style="width: 100%" align="center">
      <el-table-column prop="eId" label="编号" width="150"></el-table-column>
      <el-table-column prop="dept.deptName" label="部门名称" width="120"></el-table-column>
      <el-table-column prop="job.jobName" label="岗位名称" width="120"></el-table-column>
      <el-table-column prop="name" label="姓名" width="120"></el-table-column>
      <el-table-column prop="sex" label="性别" width="120" :formatter="sexformat"></el-table-column>
      <el-table-column prop="createData" label="入职日期" width="120"></el-table-column>
      <el-table-column prop="degree" label="学历" width="120" :formatter="degreeformat"></el-table-column>
    </el-table>
    <el-pagination
      background
      layout="prev, pager, next"
      :total="tableData.total"
      :current-page="this.queryParams.pageNo"
      :page-size="this.queryParams.pageSize"
      @current-change="changePageNo"
    ></el-pagination>
  </div>
</template>

<script>
export default {
  inject: ["reload"],
  data() {
    return {
      search: {
        deptId: "",
        createData: "",
        createDataSearch: ""
      },

      queryParams: {
        pageNo: 1,
        pageSize: 10,
        deptId: "",
        createData: "",
        createDataSearch: ""
      },
      deptData: {},
      tableData: {},
      downloadData: {}
    };
  },
  created() {
    this.getData();
    this.getDeptData();
    this.getDownloadData();
  },
  watch: {
    queryParams: {
      handler: function() {
        this.getData();
      },
      deep: true
    }
  },
  mounted() {},
  methods: {
    getData() {
      this.get(
        "table/list",
        data => {
          this.tableData = data;
        },
        this.queryParams
      );
    },
    getDeptData() {
      this.get(
        "dept/list",
        data => {
          this.deptData = data;
        },
        this.queryParams
      );
    },
    getDownloadData() {
      this.get(
        "table/downlist",
        data => {
          this.downloadData = data;
        },
        this.queryParams
      );
    },
    sexformat(row, column, cellValue, index) {
      if (cellValue == 1) return "男";
      else return "女";
    },
    degreeformat(row, column, cellValue, index) {
      if (cellValue == 1) return "高中及以下";
      else if (cellValue == 2) return "大专";
      else if (cellValue == 3) return "本科";
      else return "研究生";
    },
    changePageNo(i) {
      this.queryParams.pageNo = i;
    },
    findData() {
      this.queryParams.pageNo = 1;
      this.merge(this.search, this.queryParams);
    },
    export2Excel() {
      let list = this.downloadData.job;
      require.ensure([], () => {
        const { export_json_to_excel } = require("../../vendor/Export2Excel");
        const tHeader = [
          "编号",
          "部门名称",
          "岗位名称",
          "姓名",
          "性别",
          "入职日期",
          "学历"
        ]; //对应表格输出的title
        const filterVal = [];
        this.downloadData.forEach(function(item) {
          filterVal.push([
            item.eId,
            item.dept.deptName,
            item.job.jobName,
            item.name,
            item.sex,
            item.createData,
            item.degree
          ]);
        });
        // 对应表格输出的数据
        export_json_to_excel(tHeader, filterVal, "新聘员工excel"); //对应下载文件的名字
      });
    }
  }
};
</script>

<style scoped>
</style>
