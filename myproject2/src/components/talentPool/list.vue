<template>
  <div>
      <div style="margin-top: 15px;">
          <el-row>
              <el-col :span="2"><el-button type="primary" @click="add">添加</el-button></el-col>
              <el-col :span="22">
                <el-input placeholder="请输入姓名" v-model="search.name" class="input-with-select">
                    <el-select v-model="search.active" style="width:130px" slot="prepend" placeholder="请选择" @change="findData">
                        <el-option label="状态：  全部" value="">全部</el-option>
                        <el-option label="状态：  无效" value="0">无效</el-option>
                        <el-option label="状态：  有效" value="1">有效</el-option>
                        <el-option label="状态：已录取" value="2">已录取</el-option>
                    </el-select>
                    <el-select v-model="search.sex" style="width:130px" slot="prepend" placeholder="请选择" @change="findData">
                        <el-option label="性别：全部" value="">全部</el-option>
                        <el-option label="性别：  男" value="1">男</el-option>
                        <el-option label="性别：  女" value="0">女</el-option>
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
        <!-- <el-table-column
        prop="empId"
        label="编号"
        width="150">
        </el-table-column> -->
        <el-table-column
        prop="name"
        label="姓名"
        width="120">
        </el-table-column>
        <!-- <el-table-column
        prop="sex"
        label="性别"
        width="120"
        :formatter="sexformat">
        </el-table-column> -->
        <!-- <el-table-column
        prop="birthday"
        label="出生日期"
        width="120">
        </el-table-column> -->
        <!-- <el-table-column
        prop="idCard"
        label="身份证号"
        width="120">
        </el-table-column> -->
        <el-table-column
        prop="dept"
        label="部门"
        width="120"
        :formatter="deptformat">
        <!-- <el-option v-for="entry in depts" :label="entry.name" :value="entry.id" :key="entry.id"></el-option> -->
        </el-table-column>
         <el-table-column
        prop="job"
        label="岗位"
        width="120"
        :formatter="jobformat">
        </el-table-column>
         <!-- <el-table-column
        prop="createData"
        label="入职日期"
        width="120">
        </el-table-column> -->
         <!-- <el-table-column
        prop="jobDate"
        label="工作时间"
        width="120">
        </el-table-column> -->
        <!-- <el-table-column
        prop="workType"
        label="工作性质"
        width="120"
        :formatter="workTypeformat">
        </el-table-column> -->
        <!-- <el-table-column
        prop="source"
        label="招聘途径"
        width="120"
        :formatter="sourceformat">
        </el-table-column> -->
        <!-- <el-table-column
        prop="politic"
        label="政治面貌"
        width="120"
        :formatter="politicformat">
        </el-table-column> -->
        <!-- <el-table-column
        prop="folk"
        label="民族"
        width="120"
        :formatter="folkformat">
        </el-table-column> -->
        <!-- <el-table-column
        prop="nativePlace"
        label="籍贯"
        width="120">
        </el-table-column> -->
        <!-- <el-table-column
        prop="phone"
        label="手机号"
        width="120">
        </el-table-column>
        <el-table-column
        prop="email"
        label="邮箱"
        width="120">
        </el-table-column> -->
        <!-- <el-table-column
        prop="height"
        label="身高"
        width="120">
        </el-table-column>
        <el-table-column
        prop="blood"
        label="血型"
        width="120"
        :formatter="bloodformat">
        </el-table-column> -->
        <!-- <el-table-column
        prop="marriage"
        label="婚姻状况"
        width="120"
        :formatter="marriageformat">
        </el-table-column> -->
        <!-- <el-table-column
        prop="birthPlace"
        label="出生地"
        width="120">
        </el-table-column>
        <el-table-column
        prop="house"
        label="户口地"
        width="120">
        </el-table-column> -->
        <!-- <el-table-column
        prop="degree"
        label="学历"
        width="120"
        :formatter="degreeformat">
        </el-table-column> -->
        <el-table-column
        prop="diploma"
        label="学位"
        width="120"
        :formatter="diplomaformat">
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
        prop="active"
        label="状态"
        width="120"
        :formatter="activeformat">
        </el-table-column>
        <el-table-column
        label="操作"
        width="100">
        <template slot-scope="scope">
            <el-button @click="edit(scope.row)" type="text" size="small">{{edittext(scope.row.active)}}</el-button>
            <el-button @click="edit3(scope.row)" type="text" size="small">{{edit3text()}}</el-button>
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
    import EditTalentPool from '@/components/talentPool/edit'
    import Edit2TalentPool from '@/components/talentPool/edit2'
    import Edit3TalentPool from '@/components/talentPool/edit3'
  export default {
      inject:['reload'],
      name:"talentPool",
    data () {
      return {
          search:{
              active:"",
              sex:"",
              name:""
          },
          queryParams:{
              pageNo:1,
              pageSize:10,
              active:"",
              sex:"",
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
            this.get("talentPool/list",(data)=>{
                this.tableData=data;   
            },this.queryParams);
            this.get("talentPool/getDept",(data)=>{
            console.log(data+"GG");
            //this.jobs=data.jobs;
            this.depts=data;
        });
        this.get("talentPool/getJob",(data)=>{
            console.log(data+"GG");
            //this.jobs=data.jobs;
            this.jobs=data;
        });
        },
        // typeformat(row, column, cellValue, index){
        //     return cellValue==0?"公司":"部门";
        // },
        sexformat(row, column, cellValue, index){
            // return cellValue==0?"女":"男";
            let j;
            if(cellValue==0){
                j="女";

            }else if(cellValue==1){
                j="男";
            }
           return j;
            
        },bloodformat(row,column,callValue,index){
            let i;
            switch(callValue){
                case 1:{i="O 型";break;}
                case 2:{i="A 型";break;}
                case 3:{i="B 型";break;}
                case 4:{i="AB 型";break;}
                case 5:{i="RH阴 型";break;}
                case 6:{i="RH阳";break;}
                default:{i="其他";break;}
                
            }
            // if(callValue==1){
            //     i="O 型"
            // }
            return i;
        },activeformat(row, column, callValue, index){
            // return cellValue==0?"女":"男";
            let i;
            if(callValue==0){
                i="无效";

            }else if(callValue==1){
                i="有效";
            }else if(callValue==2){
                i="已录取";
            }
           return i;
            
        },
        deptformat(row,column,cellValue,index){

            switch(cellValue){
                case 1:{
                    
                    return "开发部";
                    }
                case 2:return "开发二部";
                case 3:return "保洁部";
                case 4:return "部门4";
            }
        },
        jobformat(row,column,cellValue,index){
            switch(cellValue){
                case 1:return "Java开发工程师";
                case 2:return "资深保洁员";
            }
        },
        workTypeformat(row,column,cellValue,index){
            switch(cellValue){
                case 1:return "正式工";
                case 2:return "临时工";
                default:return "端茶倒水";
            }
        },
        sourceformat(row,column,cellValue,index){
            switch(cellValue){
                case 1:return "校招";
                case 2:return "社招";
                case 3:return "其他";
                default:return "我的人";
            }
        },
        politicformat(row,column,cellValue,index){
            switch(cellValue){
                case 1:return "普通人";
                case 2:return "少先队";
                case 3:return "共青团员";
                case 4:return "共产党员";
                default:return "FFF";
            }
        },
        folkformat(row,column,cellValue,index){
            switch(cellValue){
                case "1":return "汉";
                case "2":return "少数民族";
                default:return "食人族";
            }
        },
        marriageformat(row,column,cellValue,index){
            switch(cellValue){
                case 1:return "未婚";
                case 2:return "已婚";
                case 3:return "离异";
                case 4:return "丧偶";
                default:return "GAY";
            }
        },
        degreeformat(row,column,cellValue,index){
            switch(cellValue){
                case 1:return "高中以下";
                case 2:return "大专";
                case 3:return "本科";
                case 4:return "研究生";
                default:return "GAY";
            }
        },
        diplomaformat(row,column,cellValue,index){
            switch(cellValue){
                case 1:return "无学位";
                case 2:return "学士";
                case 3:return "双学士";
                case 4:return "硕士";
                case 5:return "博士";
                case 6:return "博士后";
                default:return "GAY";
            }
        },
        changePageNo(i){
            this.queryParams.pageNo=i;
        },
        findData(){
            console.log(this.search.active);
            this.queryParams.pageNo=1;
            this.merge(this.search,this.queryParams);
        },
        add(){
            this.$layer.iframe({
                content: {
                    content: Edit2TalentPool, //传递的组件对象
                    parent: this,//当前的vue对象
                    data:{}//props
                },
                area:['800px','600px'],
                title: '员工入职',
                shadeClose: false,
                shade :true
            });
        },
        edit(row){
            console.log(row)
             this.$layer.iframe({
                content: {
                    content: EditTalentPool, //传递的组件对象
                    parent: this,//当前的vue对象
                    data:{id:row.id}//props
                },
                area:['800px','600px'],
                title: '员工入职',
                shadeClose: false,
                shade :true
            });
        },
        edit3(row){
            console.log(row)
             this.$layer.iframe({
                content: {
                    content: Edit3TalentPool, //传递的组件对象
                    parent: this,//当前的vue对象
                    data:{id:row.id}//props
                },
                area:['800px','600px'],
                title: '员工入职',
                shadeClose: false,
                shade :true
            });
        },
        del(row){
            this.delete("talentPool/delTalent",row.empId,row.active);
        },
        edittext(active){
            let activeJ
            if(active=="0"){
                activeJ=""
            }else if(active=="1"){
                activeJ="入职"
            }else if(active=="2"){
                activeJ=""
            }
            return activeJ;
        },
        edit3text(){
            return "详情";
        },
        deltext(active){
            let activeI
            if(active=="0"){
                activeI="恢复"
            }else if(active=="1"){
                activeI="删除"
            }else if(active=="2"){
                activeI="已入职"
            }
            return activeI;
        }
    }
  }
</script>

<style scoped>

 
</style>
