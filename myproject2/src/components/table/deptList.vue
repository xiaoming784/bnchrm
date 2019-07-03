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
              v-model="search.tranDate"
              type="date"
              placeholder="选择开始日期"
            ></el-date-picker>
            <el-date-picker
              slot="append"
              value-format="yyyy-MM-dd"
              v-model="search.tranDateSearch"
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
      <el-table-column prop="dept.deptName" label="原部门名称" width="120"></el-table-column>
      <el-table-column prop="afterDept" label="新部门名称" width="120" :formatter="nameformat"></el-table-column>
      <!-- <el-table-column label="新部门名称" width="120">
        <template slot-scope="scope" v-for="dsds in this.deptNameData.list">{{ dsds.dept.deptName}}</template>
      </el-table-column>-->
      <el-table-column prop="emp.name" label="姓名" width="120"></el-table-column>
      <el-table-column prop="emp.sex" label="性别" width="120" :formatter="sexformat"></el-table-column>
      <el-table-column prop="tranDate" label="调动时间" width="120"></el-table-column>
      <el-table-column prop="tranReason" label="调动原因" width="120"></el-table-column>
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
        tranDate: "",
        tranDateSearch: ""
      },
      queryParams: {
        pageNo: 1,
        pageSize: 10,
        tranDate: "",
        tranDateSearch: ""
      },
      tableData: {},
      deptNameData: {},
      downloadData: {}
    };
  },
  created() {
    this.getData();
    this.getDeptNameData();
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
        "table/dept",
        data => {
          this.tableData = data;
        },
        this.queryParams
      );
    },
    getDeptNameData() {
      this.get(
        "table/deptAfter",
        data => {
          this.deptNameData = data;
        },
        this.queryParams
      );
    },
    getDownloadData() {
      this.get(
        "table/downdept",
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
    nameformat(row, column, cellValue, index) {
      if (cellValue == 1) return "开发部";
      if (cellValue == 2) return "开发二部";
      if (cellValue == 3) return "保洁部";
      if (cellValue == 4) return "保安部";
      if (cellValue == 5) return "咸鱼部";
      else return "其他部门";
    },
    // nameformat(row, column, cellValue, index) {
    //   require.ensure([], () => {
    //   //   let namememe = [];
    //   //   this.tableData.list.forEach(function(item) {
    //   //     namememe.push([item.beforeDept]);
    //   //   });
    //   //           console.log(5858585858)
    //   let namededede = [];
    //   this.deptNameData.list.forEach(function(item) {
    //     namededede.push([item.dId, item.deptName]);
    //     if (cellValue == 1) return "namededede.deptName";
    //     else return "dsdsds";
    //   });

    //   // return "dsfs";
    //   // if (namememe.beforeDept == 1)
    //   //   return "dsdsd";

    //   });
    // },
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
          "原部门名称",
          "新部门名称",
          "姓名",
          "性别",
          "调动日期",
          "调动原因"
        ]; //对应表格输出的title
        const filterVal = [];
        this.downloadData.forEach(function(item) {
          filterVal.push([
            item.empId,
            item.beforeDept,
            item.afterDept,
            item.emp.name,
            item.emp.sex,
            item.tranDate,
            item.tranReason
          ]);
        });
        export_json_to_excel(tHeader, filterVal, "部门调动员工excel"); //对应下载文件的名字
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
