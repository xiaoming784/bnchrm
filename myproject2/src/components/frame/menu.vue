<template>
    <el-row  class="tac  firstmenu" style="height:100%;" >
        <el-col style="height:100%;">
            <el-menu
            default-active="2"
            class="el-menu-vertical-demo"
            :router="true"
            @select="handleSelect"
            style="height:100%;">
                <el-submenu index="基本资料维护" >
                    <template slot="title" >基本资料维护</template>
                    <el-menu-item index="部门管理" route="dept">部门管理</el-menu-item>
                    <el-menu-item index="岗位管理" route="job">岗位管理</el-menu-item>
                    <el-menu-item index="员工管理" route="emp">员工管理</el-menu-item>
                </el-submenu>
                <el-submenu index="员工异动管理">
                    <template slot="title">员工异动管理</template>
                    <el-menu-item index="试用期管理" route="probation">试用期管理</el-menu-item>
                    <el-menu-item index="部门调动" route="deptmob">部门调动</el-menu-item>
                    <el-menu-item index="岗位调动" route="jobmob">岗位调动</el-menu-item>
                </el-submenu>
            </el-menu>
        </el-col>
    </el-row>
</template>

<script>
    import store from '@/vuex/store'

    import {mapMutations} from 'vuex'
    export default {
        name:'mymenu',
        data () {
            return {

            }
        },
        methods: {
            ...mapMutations(['SET_MENU']),
            handleSelect(key, keyPath) {
               this.SET_MENU(keyPath);
            }
        },
        store
    }
</script>
<style>
    .firstmenu .el-submenu__title:hover {
        padding-left:23px !important ;
    }

</style>

<style scoped>
    .el-menu{
        border-right: 0;
    }
    .el-menu--inline .el-menu-item:hover{
        padding-left:43px !important;
    }
</style>
