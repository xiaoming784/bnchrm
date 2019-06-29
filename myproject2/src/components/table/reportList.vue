<template>
  <div>
    <div style="margin-top: 15px;">
      <el-row>
        <el-col :span="2">
          <el-button type="primary" @click="add">添加</el-button>
        </el-col>
        <el-col :span="22">
          <el-input placeholder="请输入部门名称" v-model="search.name" class="input-with-select">
            <el-button slot="append" icon="el-icon-search" @click="findData"></el-button>
          </el-input>
        </el-col>
      </el-row>
    </div>
    <el-table :data="tableData.list" border style="width: 100%" align="center">
      <el-table-column prop="dept" label="部门名称" width="80"></el-table-column>
      <!-- <el-table-column prop="job" label="岗位名称" width="120"></el-table-column>
      <el-table-column prop="name" label="姓名" width="120"></el-table-column>
      <el-table-column prop="sex" label="性别" width="120" :formatter="sexformat"></el-table-column>-->
      <el-table-column prop="count1" label="月初人数" width="80"></el-table-column>
      <el-table-column prop="dept" label="月末人数" width="80"></el-table-column>
      <el-table-column prop="dept" label="本月新入职" width="100"></el-table-column>
      <el-table-column prop="dept" label="本月离职" width="80"></el-table-column>
      <el-table-column prop="dept" label="本月调入" width="80"></el-table-column>
      <el-table-column prop="dept" label="本月调出" width="80"></el-table-column>
      <el-table-column prop="dept" label="研究生" width="80"></el-table-column>
      <el-table-column prop="dept" label="本科" width="80"></el-table-column>
      <el-table-column prop="dept" label="大专" width="80"></el-table-column>
      <el-table-column prop="dept" label="高中及以下" width="100"></el-table-column>
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
        "table/report",
        data => {
          this.tableData = data;
        },
        this.queryParams
      );
    },
    sexformat(row, column, cellValue, index) {
      if (cellValue == 1) return "男";
      else return "女";
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
          data: { id: row.id } //props
        },
        area: ["800px", "600px"],
        title: "修改岗位",
        shadeClose: false,
        shade: true
      });
    }
  }
};
</script>

<style scoped>
</style>
