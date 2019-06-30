<template>
  <div>
      <div style="margin-top: 15px;">
      <el-row>
        <el-col :span="22">
          <el-input placeholder="请输入内容" v-model="search.name" @change="findData" class="input-with-select">
            <el-button slot="append" icon="el-icon-search" @click="findData"></el-button>
          </el-input>
        </el-col>
      </el-row>
    </div>
    <el-table :data="tableData.list" border style="width: 100%">
      <el-table-column prop="id" label="员工编号" width="200"></el-table-column>
      <el-table-column prop="name" label="姓名" width="200"></el-table-column>
      <el-table-column prop="jobInfo.jobName" label="岗位" width="200" ></el-table-column>
      <el-table-column label="操作" >
        <template slot-scope="scope">
          <el-button @click="edit(scope.row)" type="text" size="small">调动岗位</el-button>
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
    import EditJobMob from '@/components/jobMob/edit'
  export default {
      inject:['reload'],
      name:"job",
    data () {
      return {
          search:{
              results:"",
              name:""
          },
          queryParams:{
              pageNo:1,
              pageSize:10,
              results:"",
              name:""
          },
          tableData:{},
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
            this.get("emp/getempjobmob",(data)=>{
                this.tableData=data;
                console.log(this.tableData.list)
            },this.queryParams);
        },
        changePageNo(i){
            this.queryParams.pageNo=i;
        },
        findData(){
            this.queryParams.pageNo=1;
            this.merge(this.search,this.queryParams);
        },
        edit(row){
             this.$layer.iframe({
                content: {
                    content: EditJobMob, //传递的组件对象
                    parent: this,//当前的vue对象
                    data:{id:row.id}//props
                },
                area:['800px','600px'],
                title: '员工岗位调动',
                shadeClose: false,
                shade :true
            });
        },
    }
  }
</script>

<style scoped>

 
</style>
