<template>
  <div>
    <div style="margin-top: 15px;">
      <el-row>
        <el-col :span="2">
          <el-button type="info" @click="export2Excel">下载</el-button>
        </el-col>
        <el-col :span="1">
          <el-input class="input-with-select">
            <el-date-picker
              slot="append"
              value-format="yyyy-MM-dd"
              v-model="search.quitDate"
              type="date"
              placeholder="选择开始日期"
            ></el-date-picker>
            <el-date-picker
              slot="append"
              value-format="yyyy-MM-dd"
              v-model="search.quitDateSearch"
              type="date"
              placeholder="选择结束日期"
            ></el-date-picker>
            <el-button slot="append" icon="el-icon-search" @click="findData"></el-button>
          </el-input>
        </el-col>
      </el-row>
    </div>
    <el-table :data="tableData.list" border style="width: 100%" align="center">
      <el-table-column prop="empId" label="编号" width="150"></el-table-column>
      <el-table-column prop="dept.deptName" label="部门名称" width="120"></el-table-column>
      <el-table-column prop="job.jobName" label="岗位名称" width="120"></el-table-column>
      <el-table-column prop="emp.name" label="姓名" width="120"></el-table-column>
      <el-table-column prop="emp.sex" label="性别" width="120" :formatter="sexformat"></el-table-column>
      <el-table-column prop="quitDate" label="离职时间" width="120"></el-table-column>
      <el-table-column prop="quitType" label="离职原因" width="120" :formatter="quitformat"></el-table-column>
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
import EditJob from "@/components/job/edit";
export default {
  inject: ["reload"],
  name: "job",
  data() {
    return {
      search: {
        deptId: "",
        quitDate: "",
        quitDateSearch: ""
      },
      queryParams: {
        pageNo: 1,
        pageSize: 10,
        deptId: "",
        quitDate: "",
        quitDateSearch: ""
      },
      tableData: {},
      downloadData: {}
    };
  },
  created() {
    this.getData();
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
        "table/quit",
        data => {
          this.tableData = data;
        },
        this.queryParams
      );
    },
    getDownloadData() {
      this.get(
        "table/downquit",
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
    quitformat(row, column, cellValue, index) {
      if (cellValue == 1) return "主动辞职";
      else if (cellValue == 2) return "辞退";
      else if (cellValue == 3) return "退休";
      else if (cellValue == 4) return "开除";
      else return "试用期未通过";
    },
    changePageNo(i) {
      this.queryParams.pageNo = i;
    },
    findData() {
      this.queryParams.pageNo = 1;
      this.merge(this.search, this.queryParams);
    },
    export2Excel() {
      require.ensure([], () => {
        const { export_json_to_excel } = require("../../vendor/Export2Excel");
        const tHeader = [
          "编号",
          "部门名称",
          "岗位名称",
          "姓名",
          "性别",
          "离职时间",
          "离职原因"
        ]; //对应表格输出的title
        const filterVal = [];
        this.downloadData.forEach(function(item) {
          filterVal.push([
            item.empId,
            item.dept.deptName,
            item.job.jobName,
            item.emp.name,
            item.emp.sex,
            item.quitDate,
            item.quitType
          ]);
        });
        export_json_to_excel(tHeader, filterVal, "离职员工excel"); //对应下载文件的名字
      });
    },
    formatJson(filterVal, jsonData) {
      return jsonData.map(v => filterVal.map(j => v[j]));
    }
  }
};
</script>

<style scoped>
</style>
