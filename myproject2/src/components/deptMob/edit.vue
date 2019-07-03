<template>
  <div>
    <el-form :model="deptTransfer" :rules="rules" ref="deptTransfer" label-width="100px" class="demo-ruleForm">
      <el-form-item label="员工编号" prop="empId">
        <p v-text="deptTransfer.empId"></p>
      </el-form-item>
      <el-form-item label="姓名" prop="name">
        <p v-text="ruleForm.name"></p>
      </el-form-item>
      <el-form-item label="现部门" prop="beforeDept">
        <p v-text="deptTransfer.beforeDept"></p>
      </el-form-item>
      <el-form-item label="调动部门" prop="afterDept">
        <el-select v-model="deptTransfer.afterDept" placeholder="请选择活动区域">
          <el-option v-for="item in dept" :key="item.dId" :label="item.deptName" :value="item.dId"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="调动类型" prop="tranType">
        <el-select v-model="deptTransfer.tranType" placeholder="请选择活动区域">
          <el-option label="主动调动" :value="1"></el-option>
          <el-option label="被动调动" :value="2"></el-option>
          <el-option label="数据错误" :value="3"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="调动原因" prop="tranReason">
        <el-input v-model="deptTransfer.tranReason"></el-input>
      </el-form-item>
      <el-form-item label="备注" prop="remarks">
        <el-input v-model="deptTransfer.remarks"></el-input>
      </el-form-item>
      <el-form-item label="调动日期" prop="tranDate">
        <p v-text="deptTransfer.tranDate"></p>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('deptTransfer')">{{buttonText}}</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  inject: ["reload"],
  props: ["eId"],
  data() {
    name: "probationedit";
    return {
      ruleForm: {
        eId: "",
        name:"",
        deptInfo:{
            dId:"",
            name:""
        }
      },
      deptTransfer:{
        id: "",
        empId:"",
        beforeDept:"",
        afterDept:"",
        tranType:"",
        tranReason:"",
        remarks:"",
        tranDate:""
      },
      dept:{},
      rules: {
        afterDept: [
          { required: true, message: '请选择调动部门', trigger: 'blur' }
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
    if (this.eId) {
        console.log("this的id"+this.eId);
      this.get("emp/getOneTransfer",data => {
          this.ruleForm = data;
          this.deptTransfer.empId=this.ruleForm.eId;
          this.deptTransfer.beforeDept=this.ruleForm.deptId;
          this.getTime();
          console.log("Transfer");
          console.log(this.ruleForm);
        },
        { eId: this.eId }
      );
      this.get("dept/getAll",(data)=>{
          this.dept=data;
          console.log(this.dept)
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
      this.deptTransfer.tranDate=currentdate;
      console.log("date:"+this.deptTransfer.tranDate);
    },
    typeformat(row, column, cellValue, index){
      console.log("检测格式化");
      return "test";
      },
    submitForm(formName) {
      console.log("提交表单");
      console.log(this.deptTransfer);
      this.post(formName, "depttransfer/add", this.deptTransfer);
    }
  }
};
</script>

<style scoped>
</style>
