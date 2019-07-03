<template>
  <div>
    <el-form
      :model="ruleForm"
      :rules="rules"
      ref="ruleForm"
      label-width="100px"
      class="demo-ruleForm"
    >
      <el-form-item label="部门名称" prop="name">
        <el-input v-model="ruleForm.deptName"></el-input>
      </el-form-item>
      <el-form-item label="部门类型" prop="type">
        <el-select v-model="ruleForm.type" placeholder="请选择活动区域">
          <el-option label="公司" :value="0"></el-option>
          <el-option label="部门" :value="1"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="电话" prop="phone">
        <el-input v-model="ruleForm.deptPhone"></el-input>
      </el-form-item>
      <el-form-item label="传真" prop="fax">
        <el-input v-model="ruleForm.fax"></el-input>
      </el-form-item>
      <el-form-item label="描述" prop="description">
        <el-input type="textarea" v-model="ruleForm.description"></el-input>
      </el-form-item>
      <el-form-item label="上级ID" prop="parentId">
        <el-input v-model="ruleForm.parentId"></el-input>
      </el-form-item>
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
  props: ["dId"],
  data() {
    name: "deptedit";
    return {
      ruleForm: {
        dId: "",
        deptName: "",
        type: "",
        deptPhone: "",
        fax: "",
        description: "",
        parentId: "0"
      },
      rules: {
        deptName: [
          { required: true, message: "请输入部门名称", trigger: "blur" },
          { min: 1, max: 20, message: "长度在 1 到 20 个字符", trigger: "blur" }
        ],
        type: [{ required: true, message: "请选择类型", trigger: "blur" }],
        deptPhone: [{ required: true, message: "请输入电话", trigger: "blur" }],
        fax: [{ required: true, message: "请输入传真", trigger: "blur" }]
      },
      buttonText: "创建"
    };
  },
  created() {
    if (this.dId) {
      this.get(
        "dept/getOne",
        data => {
          this.ruleForm = data;
          console.log(this.ruleForm);
        },
        { dId: this.dId }
      );
      this.buttonText = "修改";
    }
  },
  components: {},
  methods: {
    resetForm(formName) {
      this.$refs[formName].resetFields();
    },
    submitForm(formName) {
      let url = "";
      if (this.dId) url = "dept/update";
      else url = "dept/add";
      this.post(formName, url, this.ruleForm);
    }
  }
};
</script>

<style scoped>
</style>
