<template>
  <div>
      <div style="margin-top: 15px;">
          <el-row>
              <!-- <el-col :span="2"><el-button type="primary" @click="add">添加</el-button></el-col> -->
              <el-col :span="22">
                <el-input placeholder="请输入部门名称" v-model="search.name" class="input-with-select">
                    <el-select v-model="search.active" style="width:100px" slot="prepend" placeholder="请选择">
                        <el-option label="全部" value=""></el-option>
                        <el-option label="男" value="1"></el-option>
                        <el-option label="女" value="0"></el-option>
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
        prop="empId"
        label="编号"
        width="150">
        </el-table-column>
        <el-table-column
        prop="name"
        label="姓名"
        width="120">
        <!-- :formatter="typeformat"-->
        </el-table-column>
        <el-table-column
        prop="sex"
        label="性别"
        width="120"
        :formatter="activeformat">
        </el-table-column>
        <el-button @click="show3 = !show3">Click Me</el-button>
        <el-table-column
        prop="birthday"
        label="出生日期"
        width="120">
        </el-table-column>
        <el-table-column
        prop="idCard"
        label="身份证号"
        width="120">
        </el-table-column>
        <el-table-column
        prop="dept"
        label="部门"
        width="120">
        </el-table-column>
         <el-table-column
        prop="job"
        label="岗位"
        width="120"
        :formatter="jobformat">
        </el-table-column>
         <el-table-column
        prop="createData"
        label="入职日期"
        width="120">
        </el-table-column>
         <el-table-column
        prop="jobDate"
        label="工作时间"
        width="120">
        <!-- :formatter="activeformat" -->
        </el-table-column>
        <el-table-column
        prop="workType"
        label="工作性质"
        width="120">
        </el-table-column>
        <el-table-column
        prop="source"
        label="招聘途径"
        width="120">
        </el-table-column>
        <el-table-column
        prop="politic"
        label="政治面貌"
        width="120">
        </el-table-column>
        <el-table-column
        prop="folk"
        label="民族"
        width="120">
        </el-table-column>
        <el-table-column
        prop="nativePlace"
        label="籍贯"
        width="120">
        </el-table-column>
        <el-table-column
        prop="phone"
        label="手机号"
        width="120">
        </el-table-column>
        <el-table-column
        prop="email"
        label="邮箱"
        width="120">
        </el-table-column>
        <el-table-column
        prop="height"
        label="身高"
        width="120">
        </el-table-column>
        <el-table-column
        prop="blood"
        label="血型"
        width="120">
        </el-table-column>
        <el-table-column
        prop="marriage"
        label="婚姻状况"
        width="120">
        </el-table-column>
        <el-table-column
        prop="birthPlace"
        label="出生地"
        width="120">
        </el-table-column>
        <el-table-column
        prop="house"
        label="户口地"
        width="120">
        </el-table-column>
        <el-table-column
        prop="degree"
        label="学历"
        width="120">
        </el-table-column>
        <el-table-column
        prop="diploma"
        label="学位"
        width="120">
        </el-table-column>
        <el-table-column
        prop="school"
        label="毕业院校"
        width="120">
        </el-table-column>
        <el-table-column
        prop="spical"
        label="专业"
        width="120">
        </el-table-column>
        <el-table-column
        prop="graduateDate"
        label="毕业时间"
        width="120">
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
    import EditEmp from '@/components/emp/edit'
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
            this.get("talentPool/empList",(data)=>{
                this.tableData=data;   
            },this.queryParams);
        },
        // typeformat(row, column, cellValue, index){
        //     return cellValue==0?"公司":"部门";
        // },
        activeformat(row, column, cellValue, index){
            return cellValue==0?"女":"男";
        },
        // jobformat(row,column,cellValue,index){
        //     switch(cellValue){
        //         case 1:return "Java开发工程师";
        //         case 2:return "资深保洁员";
        //     }
        // },
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
                    content: EditEmp, //传递的组件对象
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
                    content: EditEmp, //传递的组件对象
                    parent: this,//当前的vue对象
                    data:{empId:row.empId}//props
                },
                area:['800px','600px'],
                title: '添加部门',
                shadeClose: false,
                shade :true
            });
        },
        del(row){
            this.delete("emp/del",row.id,row.active);
        },
        deltext(active){
            return active==1?"删除":"恢复"
        }
    }
  }
</script>

<style scoped>

 
</style>
