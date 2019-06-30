<template>
  <div>
      <div style="margin-top: 15px;">
          <el-row>
              <el-col :span="2"><el-button type="primary" @click="add">添加</el-button></el-col>
              <el-col :span="22">
                <el-input placeholder="请输入员工姓名" v-model="search.empName" class="input-with-select">
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
        label="员工编号"
        width="100">
        </el-table-column>
        <el-table-column
        prop="empName"
        label="员工姓名"
        width="120">
        </el-table-column>
        <el-table-column
        prop="deptId"
        label="员工所属部门ID"
        width="130"
        :formatter="deptidformat">
        </el-table-column>
        <el-table-column
        prop="relaName"
        label="亲属姓名"
        width="120">
        </el-table-column>
        <el-table-column
        prop="relationship"
        label="与本人关系"
        width="120"
        :formatter="typeformat1">
        </el-table-column>
        <el-table-column
        prop="unit"
        label="亲属所在单位"
        width="120">
        </el-table-column>
        <el-table-column
        prop="post"
        label="亲属职位"
        width="120">
        </el-table-column>
        <el-table-column
        prop="phone"
        label="亲属联系电话"
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
    import EditFamily from '@/components/family/edit'
  export default {
      inject:['reload'],
      name:"family",
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
            this.get("family/list",(data)=>{
                this.tableData=data;   
            },this.queryParams);
        },
        typeformat1(row, column, cellValue, index){
            if(cellValue==1)
                return "父亲"
            if(cellValue==2)
                return "母亲"
            else 
                return "配偶"
        },
        activeformat(row, column, cellValue, index){
            return cellValue==0?"失效":"有效";
        },
        deptidformat(row, column, cellValue, index){
            if(cellValue==0)
                return "没有此部门"
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
                    content: EditFamily, //传递的组件对象
                    parent: this,//当前的vue对象
                    data:{}//props
                },
                area:['800px','600px'],
                title: '添加亲属信息',
                shadeClose: false,
                shade :true
            });
        },
        edit(row){
             this.$layer.iframe({
                content: {
                    content: EditFamily, //传递的组件对象
                    parent: this,//当前的vue对象
                    data:{id:row.id}//props
                },
                area:['800px','600px'],
                title: '修改亲属信息',
                shadeClose: false,
                shade :true
            });
        },
        del(row){
            this.delete("family/del",row.id,row.active);
        },
        deltext(active){
            return active==1?"删除":"恢复"
        }
    }
  }
</script>

<style scoped>

 
</style>
