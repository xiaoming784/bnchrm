<template>
  <div>
    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-form-item label="员工编号" prop="id">
        <p v-text="ruleForm.id"></p>
      </el-form-item>
      <el-form-item label="姓名" prop="name">
        <p v-text="ruleForm.name"></p>
      </el-form-item>
      <el-form-item label="考核评语" prop="handleTrial.comments">
        <el-input v-model="ruleForm.handleTrial.comments"></el-input>
      </el-form-item>
      <el-form-item label="考核结果" prop="handleTrial.commentsResults">
        <el-select v-model="ruleForm.handleTrial.commentsResults" placeholder="请选择活动区域">
          <el-option label="转正" :value="1"></el-option>
          <el-option label="延期" :value="2"></el-option>
          <el-option label="不通过" :value="3"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="处理日期" prop="handleData">
        <p v-text="ruleForm.handleTrial.handleData"></p>
      </el-form-item>
      <el-form-item label="备注" prop="remarks">
        <el-input v-model="ruleForm.handleTrial.remarks"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm')">{{buttonText}}</el-button>
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
        name: "",
        handleTrial: {
          comments: "",
          commentsResults: "",
          handleData: "",
          remarks: ""
        }
      },
      rules: {
        'handleTrial.comments': [
          { required: true, message: '请输入考核评论', trigger: 'blur' }
        ],
        'handleTrial.commentsResults': [
          { required: true, message: '请选择考核结果', trigger: 'blur' }
        ]
      },
      buttonText: "创建"
    };
  },
  created() {
    if (this.id) {
      this.get("emp/getOne",data => {
          this.ruleForm = data;
          this.getTime;
          console.log("0");
          console.log(this.ruleForm);
          console.log(this.ruleForm.handleTrial);
        },
        { id: this.id }
      );
      this.buttonText = "完成";
    }
  },
  components: {},
  methods: {
    getTime(){
      console.log("testjjjjj");
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
      this.ruleForm.handleTrial.handleData=currentdate;
      console.log("date:"+this.ruleForm.handleTrial.handleData);
    },
    submitForm(formName) {
      this.post(formName, "handletrial/update", this.ruleForm.handleTrial);
    }
  }
};
</script>

<style scoped>
</style>
