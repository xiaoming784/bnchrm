<template>
  <el-row class="tac firstmenu" style="height:100%;">
    <el-col style="height:100%;">
      <el-menu
        default-active="2"
        class="el-menu-vertical-demo"
        :router="true"
        @select="handleSelect"
        style="height:100%;"
        background-color="#545c64"
        text-color="#fff"
        active-text-color="#ffd04b"
      >
        <template slot="title">公告</template>
        <el-menu-item index="公告" route="notice">公告</el-menu-item>
        <el-submenu index="基本资料维护">
          <template slot="title">基本资料维护</template>
          <el-menu-item index="部门管理" route="dept">部门管理</el-menu-item>
          <el-menu-item index="岗位管理" route="job">岗位管理</el-menu-item>
        </el-submenu>
        <el-submenu index="报表管理">
          <template slot="title">报表管理</template>
          <el-menu-item index="新聘员工报表" route="table">新聘员工报表</el-menu-item>
          <el-menu-item index="离职员工报表" route="quit">离职员工报表</el-menu-item>
          <el-menu-item index="部门调动员工报表" route="deptlist">部门调动员工报表</el-menu-item>
          <el-menu-item index="岗位调动员工报表" route="joblist">岗位调动员工报表</el-menu-item>
          <el-menu-item index="人事月报" route="reportlist">人事月报</el-menu-item>
        </el-submenu>
      </el-menu>
    </el-col>
  </el-row>
</template>

<script>
import store from "@/vuex/store";

import { mapMutations } from "vuex";
export default {
  name: "mymenu",
  data() {
    return {};
  },
  methods: {
    ...mapMutations(["SET_MENU"]),
    handleSelect(key, keyPath) {
      this.SET_MENU(keyPath);
    }
  },
  store
};
</script>
<style>
.firstmenu .el-submenu__title:hover {
  padding-left: 23px !important ;
}
</style>

<style scoped>
.el-menu {
  border-right: 0;
}
.el-menu--inline .el-menu-item:hover {
  padding-left: 43px !important;
}
</style>
