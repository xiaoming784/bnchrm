<template>
  <div>
      <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
        <!-- <el-form-item label="员工姓名" prop="empName">
            <el-input v-model="ruleForm.empName"></el-input>
        </el-form-item>
        <el-form-item label="所属部门Id" prop="deptName">
            <el-input v-model="ruleForm.deptName"></el-input>
        </el-form-item> -->
        <el-form-item label="语种" prop="languages">
            <el-select v-model="ruleForm.languages" placeholder="请选择语种">
                <el-option label="英语" :value="1"></el-option>
                <el-option label="其他" :value="2"></el-option>
            </el-select>
        </el-form-item>
        <el-form-item label="熟练程度" prop="proficiency">
            <el-select v-model="ruleForm.proficiency" placeholder="请选择熟练程度">
                <el-option label="完全不懂" :value="0"></el-option>
                <el-option label="少量" :value="1"></el-option>
                <el-option label="有限" :value="2"></el-option>
                <el-option label="一般" :value="3"></el-option>
                <el-option label="好" :value="4"></el-option>
                <el-option label="流利" :value="5"></el-option>
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
        name:"foreign_languagesedit"
      return {
          ruleForm:{
            id:"",
            // empName:"",
            // deptId:"",
            languages:"",
            proficiency:""
          },
          rules: {
            languages: [
                { required: true, message: '请输入语种', trigger: 'blur' }
            ],
            proficiency: [
                { required: true, message: '请选择熟练程度', trigger: 'blur' }
            ]
        },
        buttonText:"创建"
        
      }
    },
    created(){
        if(this.id){
             this.get("foreign_languages/getOne",(data)=>{
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
                url="foreign_languages/update";
            else
                url="foreign_languages/add";
            this.post(formName,url,this.ruleForm);
        }
    }
  }
</script>

<style scoped>

</style>
