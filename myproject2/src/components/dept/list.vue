<template>
  <div>
      <div style="margin-top: 15px;">
          <el-row>
              <el-col :span="2"><el-button type="primary" @click="add">添加</el-button></el-col>
              <el-col :span="22">
                <el-input placeholder="请输入部门名称" v-model="search.name" class="input-with-select">
                    <el-select v-model="search.active" style="width:100px" slot="prepend" placeholder="请选择">
                        <el-option label="全部" value=""></el-option>
                        <el-option label="有效" value="1"></el-option>
                        <el-option label="失效" value="0"></el-option>
                    </el-select>
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
        label="部门名称"
        width="120">
        </el-table-column>
        <el-table-column
        prop="type"
        label="部门类型"
        width="120"
        :formatter="typeformat">
        </el-table-column>
        <el-table-column
        prop="phone"
        label="电话"
        width="120">
        </el-table-column>
        <el-table-column
        prop="fax"
        label="传真"
        width="120">
        </el-table-column>
        <el-table-column
        prop="parentId"
        label="上级部门"
        width="120">
        </el-table-column>
         <el-table-column
        prop="createDate"
        label="创建日期"
        width="120">
        </el-table-column>
         <el-table-column
        prop="active"
        label="是否有效"
        width="120"
        :formatter="activeformat">
        </el-table-column>
        <el-table-column
        label="操作"
        width="100">
        <template slot-scope="scope">
            <el-button @click="edit(scope.row)" type="text" size="small">修改</el-button>
            <el-button type="text" size="small" @click="del(scope.row)">{{deltext(scope.row.active)}}</el-button>
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
    import EditDept from '@/components/dept/edit'
  export default {
      inject:['reload'],
      name:"dept",
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
            this.get("dept/list",(data)=>{
                this.tableData=data;   
            },this.queryParams);
        },
        typeformat(row, column, cellValue, index){
            return cellValue==0?"公司":"部门";
        },
        activeformat(row, column, cellValue, index){
            return cellValue==0?"失效":"有效";
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
                    content: EditDept, //传递的组件对象
                    parent: this,//当前的vue对象
                    data:{}//props
                },
                area:['800px','600px'],
                title: '添加部门',
                shadeClose: false,
                shade :true
            });
        },
        edit(row){
             this.$layer.iframe({
                content: {
                    content: EditDept, //传递的组件对象
                    parent: this,//当前的vue对象
                    data:{id:row.id}//props
                },
                area:['800px','600px'],
                title: '添加部门',
                shadeClose: false,
                shade :true
            });
        },
        del(row){
            console.log(row.active);
            this.delete("dept/del",row.id,row.active);
        },
        deltext(active){
            return active==1?"删除":"恢复";
        }
    }
  }
</script>

<style scoped>

 
</style>
