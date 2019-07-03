<template>
  <div>
    <el-form
      :model="ruleForm"
      :rules="rules"
      ref="ruleForm"
      label-width="100px"
      class="demo-ruleForm"
    >
      <el-form-item label="公告标题" prop="title">
        <el-input v-model="ruleForm.title"></el-input>
      </el-form-item>
      <el-form-item label="公告内容" prop="substance">
        <el-input
          type="textarea"
          :autosize="{ minRows: 2, maxRows: 4}"
          placeholder="请输入内容"
          v-model="ruleForm.substance"
        ></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm')">添加</el-button>
        <el-button @click="resetForm('ruleForm')">重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  inject: ["reload"],
  props: ["jId"],
  data() {
    name: "noticeEdit";
    return {
      ruleForm: {
        jId: "",
        jobName: "",
        type: "",
        person: ""
      },
      rules: {
        jobName: [
          { required: true, message: "请输入部门名称", trigger: "blur" },
          { min: 1, max: 30, message: "长度在 1 到 30 个字符", trigger: "blur" }
        ],
        type: [{ required: true, message: "请选择岗位类型", trigger: "blur" }],
        person: [{ required: true, message: "请输入编制数", trigger: "blur" }]
      }
    };
  },
  created() {},
  components: {},
  methods: {
    resetForm(formName) {
      this.$refs[formName].resetFields();
    },
    submitForm(formName) {
      let url = "notice/add";
      this.post(formName, url, this.ruleForm);
    }
  }
};
</script>

<style scoped>
</style>
