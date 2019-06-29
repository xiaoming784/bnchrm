<template>
  <div>
    <div style="margin-top: 15px;"></div>
    <el-row>
      <el-col :span="15" style="marginLeft:180px">
        <el-collapse v-model="activeName" accordion>
          <el-collapse-item v-for="(item,index) in tableData.list" :key="index" :title="item.title">
            <div>{{item.substance}}</div>
            <div>
              <el-button type="danger" icon="el-icon-delete" circle size="small" @click="del(item)" style="marginLeft:610px">删除</el-button>
            </div>
          </el-collapse-item>
        </el-collapse>
      </el-col>
    </el-row>
    <el-row>
      <el-col :span="2">
        <el-button type="primary" icon="el-icon-edit" circle @click="add"></el-button>
      </el-col>
      <el-pagination
        align="right"
        background
        layout="prev, pager, next"
        :total="tableData.total"
        :current-page="this.queryParams.pageNo"
        :page-size="this.queryParams.pageSize"
        @current-change="changePageNo"
      ></el-pagination>
    </el-row>
  </div>
</template>

<script>
import EditDept from "@/components/notice/edit";
export default {
  inject: ["reload"],
  deptName: "dept",
  data() {
    return {
      search: {
        active: "",
        deptName: ""
      },
      queryParams: {
        pageNo: 1,
        pageSize: 10,
        active: "",
        deptName: ""
      },
      tableData: {},
      activeName: "1"
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
        "notice/list",
        data => {
          this.tableData = data;
          console.log(this.tableData.list);
        },
        this.queryParams
      );
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
          content: EditDept, //传递的组件对象
          parent: this, //当前的vue对象
          data: {} //props
        },
        area: ["800px", "600px"],
        title: "添加公告",
        shadeClose: false,
        shade: true
      });
    },
    del(item) {
      this.delete("notice/del", item.dId, item.active);
    },
    deltext(active) {
      return active == 1 ? "删除" : "恢复";
    }
  }
};
</script>

<style scoped>
</style>
