<template>
  <div>
      <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
        <el-form-item label="岗位名称" prop="name">
            <el-input v-model="ruleForm.name"></el-input>
        </el-form-item>
        <el-form-item label="岗位类型" prop="type">
            <el-select v-model="ruleForm.type" placeholder="请选择岗位类型">
                <el-option label="管理" :value="1"></el-option>
                <el-option label="技术" :value="2"></el-option>
                <el-option label="市场" :value="3"></el-option>
                <el-option label="营销" :value="4"></el-option>
            </el-select>
        </el-form-item>
        <el-form-item label="编制数" prop="person">
            <el-input v-model="ruleForm.person"></el-input>
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
        name:"jobedit"
      return {
          ruleForm:{
            id:"",
            name:"",
            type:"",
            person:""
          },
          rules: {
            name: [
                { required: true, message: '请输入部门名称', trigger: 'blur' },
                { min: 1, max: 30, message: '长度在 1 到 30 个字符', trigger: 'blur' }
            ],
            type: [
                { required: true, message: '请选择岗位类型', trigger: 'blur' }
            ],
            person: [
                {  required: true, message: '请输入编制数', trigger: 'blur' }
            ],
           
        },
        buttonText:"创建"
        
      }
    },
    created(){
        if(this.id){
             this.get("job/getOne",(data)=>{
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
                url="job/update";
            else
                url="job/add";
            this.post(formName,url,this.ruleForm);
        }

    }
  }
</script>

<style scoped>

 
</style>
