<template>
    <el-container class="wrap">
        <el-header class="header">
            <h1  class="title">人事管理系统</h1>
        </el-header>
        <el-container class="content">
            <el-aside width="200px">
                <Menu>
                </Menu>
            </el-aside>
            <el-main style="background:#fff;">
                <MyBreadcrumb style="margin-bottom:20px;"></MyBreadcrumb>
                <router-view></router-view>
            </el-main>
        </el-container>
    </el-container>
</template>

<script>
    import Menu from '@/components/frame/menu'
    import MyBreadcrumb from '@/components/frame/myBreadcrumb'
    export default {
        name:"index",
        data () {
            return {

            }
        },
        components: {
          Menu,
          MyBreadcrumb
      }
    }
</script>
<style scoped>
    @keyframes in {
        from{transform: translateY(-30px);opacity: 0;}
        to{transform: translateY(0px);opacity: 1;}
    }
    @-webkit-keyframes in{
        from{transform: translateY(-30px);opacity: 0;}
        to{transform: translateY(0px);opacity: 1;}
    }
    .wrap{
        height:100%;
        display: flex;
        flex-direction:column;
    }
    .header{
        padding:0;
        padding-left: 3%;
        line-height: 60px;
    }
    .header>.title{
        height:100%;
        animation: in 1s;
        -webkit-animation: in 1s;
    }
    .content{
        flex: 1;
    }

</style>
