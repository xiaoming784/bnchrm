<template>
  <div>
      <div style="margin-top: 15px;">
          <el-row>
              <el-col :span="2"><el-button type="primary" @click="add">添加</el-button></el-col>
              <el-col :span="22">
                <el-input placeholder="请输入员工名" v-model="search.name" class="input-with-select">
                    <el-button slot="append" icon="el-icon-search" @click="findData"></el-button>
                </el-input>
              </el-col>
          </el-row>
           
            
        </div>
      <el-table
        :data="tableData.list"
        border
        style="width: 100%">
        <el-table-column
        prop="id"
        label="编号"
        width="150">
        </el-table-column>
        <el-table-column
        prop="name"
        label="员工姓名"
        width="120">
        </el-table-column>
        <el-table-column
        prop="sex"
        label="性别"
        width="120"
        :formatter="sexformat">
        </el-table-column>
        <el-table-column
        prop="birthday"
        label="生日"
        width="120">
        </el-table-column>
        <el-table-column
        prop="idCard"
        label="身份证号"
        width="120">
        </el-table-column>
      
        <el-table-column
        label="操作"
        width="100">
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
        @current-change="changePageNo">
    </el-pagination>
  </div>
</template>

<script>
    import EmpDept from '@/components/emp/edit'
  export default {
      inject:['reload'],
      name:"emp",
    data () {
      return {
          search:{
              active:"",
              name:""
          },
          queryParams:{
              pageNo:1,
              pageSize:10,
              active:"",
              name:""
          },
          tableData:{}
      }
    },
    created(){
        this.getData();
    },
    watch:{
        queryParams:{
            handler:function(){
                this.getData();
            },
            deep:true
        }
    },
    mounted(){},
    methods:{
        getData(){
            this.get("emp/list",(data)=>{
                this.tableData=data;   
            },this.queryParams);
        },
        sexformat(row, column, cellValue, index){
            return cellValue==0?"女":"男";
        },
        changePageNo(i){
            this.queryParams.pageNo=i;
        },
        findData(){
            this.queryParams.pageNo=1;
            this.merge(this.search,this.queryParams);
        },
        add(){
            this.$layer.iframe({
                content: {
                    content: EmpDept, //传递的组件对象
                    parent: this,//当前的vue对象
                    data:{}//props
                },
                area:['800px','600px'],
                title: '添加员工',
                shadeClose: false,
                shade :true
            });
        },
        edit(row){
             this.$layer.iframe({
                content: {
                    content: EmpDept, //传递的组件对象
                    parent: this,//当前的vue对象
                    data:{id:row.id}//props
                },
                area:['800px','600px'],
                title: '修改员工',
                shadeClose: false,
                shade :true
            });
        }
    }
  }
</script>

<style scoped>

 
</style>
