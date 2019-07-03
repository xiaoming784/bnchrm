<template>
  <div>
    <el-form
      :model="ruleForm"
      :rules="rules"
      ref="ruleForm"
      label-width="100px"
      class="demo-ruleForm"
    >
      <!-- <template>
  <div class="block">
    <span class="demonstration">默认</span>
    <el-date-picker
      v-model="value1"
      type="date"
      placeholder="选择日期">
    </el-date-picker>
  </div>
      </template>-->
      <el-form-item label="编号" prop="empId">
        <el-input :disabled="true" v-model="ruleForm.empId"></el-input>
      </el-form-item>
      <!-- <el-form-item label="性别" prop="sex">
            <el-select :disabled="true" v-model="ruleForm.sex" placeholder="请选择活动区域">
                <el-option label="女" value="0"></el-option>
                <el-option label="男" value="1"></el-option>
            </el-select>
      </el-form-item>-->
      <!-- 出生日期 -->
      <el-form-item label="离职日期" prop="quitDate">
        <el-date-picker
          v-model="ruleForm.quitDate"
          type="date"
          placeholder="选择日期"
          value-format="yyyy-MM-dd"
        ></el-date-picker>
      </el-form-item>
      <el-form-item label="离职类型" prop="quitType">
        <el-select v-model="ruleForm.quitType" placeholder="请选择活动区域">
          <!-- <el-option label="主动辞职" value="1"></el-option>
                <el-option label="辞退" value="2"></el-option>
                <el-option label="退休" value="3"></el-option>
          <el-option label="开除" value="4"></el-option>-->
          <el-option
            v-for="item in quitTypeOption"
            :key="item.value"
            :label="item.label"
            :value="item.value"
          ></el-option>
          <!-- <el-option label="试用期未通过" value="5"></el-option> -->
        </el-select>
      </el-form-item>
      <el-form-item label="离职去向" prop="departure">
        <el-input v-model="ruleForm.departure"></el-input>
      </el-form-item>
      <!-- <el-form-item label="shadiao" prop="entering">
            <el-input :disabled="true" v-model="ruleForm.entering"></el-input>
      </el-form-item>-->
      <el-form-item label="备注" prop="remarks">
        <el-input v-model="ruleForm.remarks"></el-input>
      </el-form-item>
      <!-- <el-form-item :visible="visible">
        <el-input v-model="ruleForm.job"></el-input>
      </el-form-item> -->
      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm')">{{buttonText}}</el-button>
        <el-button @click="resetForm('ruleForm')">重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  inject: ["reload"],
  props: ["eId"],

  data() {
    name: "talenPooledit";
    return {
      ruleForm: {
        qId: "",
        empId: "",
        quitDate: "",
        quitType: "",
        departure: "",
        //entering:"1",
        remarks: ""
      },
      pickerOptions: {
        disabledDate(time) {
          return time.getTime() > Date.now();
        }
      },
      quitTypeOption: [
        { value: 1, label: "主动辞职" },
        {
          value: 2,
          label: "辞退"
        },
        { value: 3, label: "退休" },
        { value: 4, label: "开除" },
        { value: 5, label: "试用期未通过" }
      ],
      quitDate: "",
      rules: {
        quitType: [
          { required: true, message: "请输入离职类型", trigger: "blur" }
          // { min: 1, max: 20, message: '长度在 1 到 20 个字符', trigger: 'blur' }
        ]
      },
      buttonText: "创建"
    };
  },
  created() {
    this.getData()
    if (this.eId) {
      console.log(this.eId);
      console.log(Date.now());
      this.get(
        "talentPool/getOneQuit",
        data => {
          this.ruleForm = data;
          //console.log(this.ruleForm);
        },
        { eId: this.eId }
      );
      this.buttonText = "离职";
    }
  },
  components: {},
  methods: {
    getData() {
      this.get(
        "job/list",
        data => {
          this.resetForm.job = data;
        },
        this.queryParams,
        console.log(this.resetForm.job)
      );
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    },
    submitForm(formName) {
      let url = "";
      this.resetForm.job.jobName = "fffff"
      if (this.empId) {
        url = "talentPool/addQuit";
      } else {
        url = "talentPool/addQuit";
      }
      // url="emp/add";
      console.log(this.ruleForm);
      this.post(formName, url, this.ruleForm);
    }
  }
};
</script>

<style scoped>
</style>
