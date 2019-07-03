<template>
  <div>
      <div style="margin-top: 15px;">
          <el-row>
              <el-col :span="2"><el-button type="primary" @click="add">添加</el-button></el-col>
              <el-col :span="22">
                <el-input placeholder="请输入员工姓名" v-model="search.empName" class="input-with-select">
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
        label="员工id"
        width="120">
        </el-table-column>
        <el-table-column
        prop="empName"
        label="员工姓名"
        width="150">
        </el-table-column>
        <el-table-column
        prop="deptId"
        label="所属部门ID"
        width="150"
        >
        </el-table-column>
        <el-table-column
        prop="beginData"
        label="开始时间"
        width="120">
        </el-table-column>
        <el-table-column
        prop="endData"
        label="结束时间"
        width="120">
        </el-table-column>
        <el-table-column
        prop="unitName"
        label="单位名称"
        width="120">
        </el-table-column>
        <el-table-column
        prop="workers"
        label="工作内容"
        width="120">
        </el-table-column>
        <el-table-column
        prop="post"
        label="担任职务"
        width="120">
        </el-table-column>
        <el-table-column
        prop="salary"
        label="薪资"
        width="120">
        </el-table-column>
        <el-table-column
        prop="witness"
        label="证明人"
        width="120">
        </el-table-column>
        <el-table-column
        prop="witJob"
        label="证明人职务"
        width="120">
        </el-table-column>
        <el-table-column
        prop="witPhone"
        label="证明人电话"
        width="120">
        </el-table-column>
        <el-table-column
        prop="remarks"
        label="备注"
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
    import EditCareer from '@/components/career/edit'
  export default {
      inject:['reload'],
      name:"career",
    data () {
      return {
          search:{
              active:"",
              empName:""
          },
          queryParams:{
              pageNo:1,
              pageSize:10,
              active:"",
              empName:""
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
            this.get("career/list",(data)=>{
                this.tableData=data;   
            },this.queryParams);
        },
        deptidformat(row, column, cellValue, index){
            if(cellValue==0)
                return "无此部门id"
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
                    content: EditCareer, //传递的组件对象
                    parent: this,//当前的vue对象
                    data:{}//props
                },
                area:['800px','600px'],
                title: '添加职业生涯信息',
                shadeClose: false,
                shade :true
            });
        },
        edit(row){
             this.$layer.iframe({
                content: {
                    content: EditCareer, //传递的组件对象
                    parent: this,//当前的vue对象
                    data:{id:row.id}//props
                },
                area:['800px','600px'],
                title: '修改职业生涯信息',
                shadeClose: false,
                shade :true
            });
        },
        del(row){
            this.deletelll("career/del",row.id,row.active);
        },
        deltext(active){
            return active==1?"删除":"恢复"
        }
    }
  }
</script>

<style scoped>

 
</style>
