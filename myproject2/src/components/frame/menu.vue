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
                    <el-menu-item index="岗位管理">岗位管理</el-menu-item>
                    <el-menu-item index="员工管理" route="emp">员工管理</el-menu-item>
                    <el-submenu index="入职离职" >
                    <template slot="title" >入职离职</template>
                    <el-menu-item index="员工离职" route="talentPool2">员工离职</el-menu-item>
                    <el-menu-item index="员工入职" route="talentPool">员工入职</el-menu-item>
                </el-submenu>
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
