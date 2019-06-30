<template>
  <div>
    <el-form :model="jobTransfer" :rules="rules" ref="jobTransfer" label-width="100px" class="demo-ruleForm">
      <el-form-item label="员工编号" prop="empId">
        <p v-text="jobTransfer.empId"></p>
      </el-form-item>
      <el-form-item label="姓名" prop="name">
        <p v-text="ruleForm.name"></p>
      </el-form-item>
      <el-form-item label="现部门" prop="beforeJob">
        <p v-text="jobTransfer.beforeJob"></p>
      </el-form-item>
      <el-form-item label="调动岗位" prop="afterJob">
        <el-select v-model="jobTransfer.afterJob" placeholder="请选择活动区域">
          <el-option v-for="item in job" :key="item.id" :label="item.jobName" :value="item.id"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="调动类型" prop="tranType">
        <el-select v-model="jobTransfer.tranType" placeholder="请选择活动区域">
          <el-option label="主动调动" :value="1"></el-option>
          <el-option label="被动调动" :value="2"></el-option>
          <el-option label="数据错误" :value="3"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="调动原因" prop="tranReason">
        <el-input v-model="jobTransfer.tranReason"></el-input>
      </el-form-item>
      <el-form-item label="备注" prop="remarks">
        <el-input v-model="jobTransfer.remarks"></el-input>
      </el-form-item>
      <el-form-item label="调动日期" prop="tranDate">
        <p v-text="jobTransfer.tranDate"></p>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('jobTransfer')">{{buttonText}}</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  inject: ["reload"],
  props: ["id"],
  data() {
    name: "probationedit";
    return {
      ruleForm: {
        id: "",
        name:"",
        jobInfo:{
            id:"",
            name:""
        }
      },
      jobTransfer:{
        id: "",
        empId:"",
        beforeJob:"",
        afterJob:"",
        tranType:"",
        tranReason:"",
        remarks:"",
        tranDate:""
      },
      job:{},
      rules: {
        afterJob: [
          { required: true, message: '请选择调动岗位', trigger: 'blur' }
        ],
        tranType: [
          { required: true, message: '请选择调动类型', trigger: 'blur' }
        ],
        tranReason: [
          { required: true, message: '请输入调动原因', trigger: 'blur' }
        ]
      },
      buttonText: "创建"
    };
  },
  created() {
    if (this.id) {
        console.log("this的id"+this.id);
      this.get("emp/getOneTransfer",data => {
          this.ruleForm = data;
          this.jobTransfer.empId=this.ruleForm.id;
          this.jobTransfer.beforeJob=this.ruleForm.job;
          this.getTime();
          console.log("Transfer");
          console.log(this.ruleForm);
        },
        { id: this.id }
      );
      this.get("job/getAll",(data)=>{
          this.job=data;
          console.log(this.job)
          });
      this.buttonText = "完成";
    }
  },
  components: {},
  methods: {
    getTime(){
      let date = new Date();
      let seperator1 = "-";
      let year = date.getFullYear();
      let month = date.getMonth() + 1;
      let strDate = date.getDate();
      if (month >= 1 && month <= 9) {
        month = "0" + month;
      }
      if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
      }
      let currentdate = year + seperator1 + month + seperator1 + strDate;
      this.jobTransfer.tranDate=currentdate;
      console.log("date:"+this.jobTransfer.tranDate);
    },
    typeformat(row, column, cellValue, index){
      console.log("检测格式化");
      return "test";
      },
    submitForm(formName) {
      console.log("提交表单");
      console.log(this.jobTransfer);
      this.post(formName, "jobtransfer/add", this.jobTransfer);
    }
  }
};
</script>

<style scoped>
</style>
