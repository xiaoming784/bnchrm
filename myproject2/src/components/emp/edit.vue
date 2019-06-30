<template>
  <div>
      <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
        <el-form-item label="员工姓名" prop="name">
            <el-input v-model="ruleForm.name"></el-input>
        </el-form-item>
        <el-form-item label="性别" prop="sex">
            <el-select v-model="ruleForm.type" placeholder="请选择性别">
                <el-option label="女" :value="0"></el-option>
                <el-option label="男" :value="1"></el-option>
            </el-select>
        </el-form-item>
        <el-form-item label="生日" prop="birthday">
           <el-date-picker
                v-model="ruleForm.birthday"
                type="date"
                placeholder="选择日期">
            </el-date-picker>
        </el-form-item>
        <el-form-item label="身份证号" prop="idCard">
            <el-input v-model="ruleForm.idCard"></el-input>
        </el-form-item>
        <el-form-item label="部门" prop="dept">
             <el-select v-model="ruleForm.dept" placeholder="请选择部门">
                <el-option v-for="entry in depts" :label="entry.name" :value="entry.id" :key="entry.id"></el-option>
            </el-select>
        </el-form-item>
        <el-form-item label="岗位" prop="job">
             <el-select v-model="ruleForm.job" placeholder="请选择岗位">
                <el-option v-for="entry in jobs" :label="entry.name" :value="entry.id" :key="entry.id"></el-option>
            </el-select>
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
      inject:['reload'],
      props:["id"],
    data () {
        name:"empedit"
      return {
          jobs:[],
          depts:[],
          ruleForm:{
            id:"",
            name:"",
            sex:"",
            birthday:"",
            idCard:"",
            dept:"",
            job:""
          },
          rules: {
            name: [
                { required: true, message: '请输入部门名称', trigger: 'blur' },
                { min: 1, max: 20, message: '长度在 1 到 20 个字符', trigger: 'blur' }
            ]
        },
        buttonText:"创建"
        
      }
    },
    created(){
        this.get("emp/getDeptJob",(data)=>{
            this.jobs=data.jobs;
            this.depts=data.depts;
        });

        if(this.id){
             this.get("dept/getOne",(data)=>{
                this.ruleForm=data;
                console.log(this.ruleForm);
            },{id:this.id}); 
            this.buttonText="修改"
        }
           
    },
    components: {

    },
    methods:{
        resetForm(formName){
             this.$refs[formName].resetFields();
        },
        submitForm(formName){
            let url="";
            if(this.id)
                url="dept/update";
            else
                url="dept/add";
            this.post(formName,url,this.ruleForm);
        }

    }
  }
</script>

<style scoped>

 
</style>
