<template>
  <div>
    <div style="margin-top: 15px;">
      <el-row>
        <el-col :span="2">
          <el-button type="primary" @click="add">添加</el-button>
        </el-col>
        <el-col :span="22">
          <el-input placeholder="请输入岗位名称" v-model="search.name" class="input-with-select">
            <el-button slot="append" icon="el-icon-search" @click="findData"></el-button>
          </el-input>
        </el-col>
      </el-row>

    </div>
    <el-table :data="tableData.list" border style="width: 100%">
      <el-table-column prop="jId" label="编号" width="150"></el-table-column>
      <el-table-column prop="jobName" label="岗位名称" width="120"></el-table-column>
      <el-table-column prop="type" label="岗位类型" width="120" :formatter="typeformat"></el-table-column>
      <el-table-column prop="person" label="编制数" width="120"></el-table-column>

      <el-table-column label="操作" width="100">
        <template slot-scope="scope">
          <el-button @click="edit(scope.row)" type="text" size="small">修改</el-button>
        </template>
      </el-table-column>
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
        name: ""
      },
      queryParams: {
        pageNo: 1,
        pageSize: 10,
        name: ""
      },
      tableData: {}
    };
  },
  created() {
    this.getData();
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
        "job/list",
        data => {
          this.tableData = data;
        },
        this.queryParams
      );
    },
    typeformat(row, column, cellValue, index) {
      if (cellValue == 1) return "管理";
      else if (cellValue == 2) return "技术";
      else if (cellValue == 3) return "市场";
      else return "营销";
    },
    changePageNo(i) {
      this.queryParams.pageNo = i;
    },
    findData() {
      this.queryParams.pageNo = 1;
      this.merge(this.search, this.queryParams);
    },
    add() {
      this.$layer.iframe({
        content: {
          content: EditJob, //传递的组件对象
          parent: this, //当前的vue对象
          data: {} //props
        },
        area: ["800px", "600px"],
        title: "添加岗位",
        shadeClose: false,
        shade: true
      });
    },
    edit(row) {
      this.$layer.iframe({
        content: {
          content: EditJob, //传递的组件对象
          parent: this, //当前的vue对象
          data: { jId: row.jId } //props
        },
        area: ["800px", "600px"],
        title: "修改岗位",
        shadeClose: false,
        shade: true
      });
    },
    export2Excel() {
      require.ensure([], () => {
        const { export_json_to_excel } = require("../../vendor/Export2Excel");
        const tHeader = ["编号", "岗位名称", "岗位类型", "编制数"]; //对应表格输出的title
        const filterVal = ["jId", "jobName", "type", "person"]; // 对应表格输出的数据
        const list = this.tableData.list;
        const data = this.formatJson(filterVal, list);
        export_json_to_excel(tHeader, data, "列表excel"); //对应下载文件的名字
      });
    },
    formatJson(filterVal, jsonData) {
      console.info(jsonData);
      return jsonData.map(v => filterVal.map(j => v[j]));
    }
  }
};
</script>

<style scoped>
</style>
