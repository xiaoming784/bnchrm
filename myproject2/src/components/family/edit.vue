<template>
  <div>
      <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
         <!-- <el-form-item label="员工姓名" prop="empName">
            <el-input v-model="ruleForm.empName"></el-input>
        </el-form-item>
        <el-form-item label="所属部门Id" prop="deptId">
            <el-input v-model="ruleForm.deptName"></el-input>
        </el-form-item>  -->
        <el-form-item label="亲属姓名" prop="relaName">
            <el-input v-model="ruleForm.relaName"></el-input>
        </el-form-item>
        <el-form-item label="与本人关系" prop="relationship">
            <el-select v-model="ruleForm.relationship" placeholder="请选择亲属关系">
                <el-option label="父亲" :value="1"></el-option>
                <el-option label="母亲" :value="2"></el-option>
                <el-option label="配偶" :value="3"></el-option>
            </el-select>    
        </el-form-item>
        <el-form-item label="所在单位" prop="unit">
            <el-input v-model="ruleForm.unit"></el-input>
        </el-form-item>
        <el-form-item label="亲属职位" prop="post">
            <el-input v-model="ruleForm.post"></el-input>
        </el-form-item>
        <el-form-item label="联系电话" prop="phone">
            <el-input v-model="ruleForm.phone"></el-input>
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
        name:"familyedit"
      return {
          ruleForm:{
            id:"",
            // empName:"",
            // deptId:"",
            relaName:"",
            relationship:"",
            unit:"",
            post:"",
            phone:"" 
          },
          rules: {
            // empName: [
            //     {  required: true, message: '默认与此ID员工姓名一致', trigger: 'blur' }
            // ],
            // deptId: [
            //     {  required: true, message: '默认与此ID员工所属部门Id一致', trigger: 'blur' }
            // ],
            relaName: [
                {  required: true, message: '请输入亲属姓名', trigger: 'blur' }
            ],
            relationship: [
                { required: true, message: '请输入与本人关系', trigger: 'blur' }
            ],
            unit: [
                {  required: true, message: '请输入所在单位', trigger: 'blur' }
            ],
            post: [
                {  required: true, message: '请输入职位', trigger: 'blur' }
            ],
            phone: [
                {  required: true, message: '请输入联系电话', trigger: 'blur' }
            ]
        },
        buttonText:"创建"
        
      }
    },
    created(){
        if(this.id){
             this.get("family/getOne",(data)=>{
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
                url="family/update";
            else
                url="family/add";
            this.post(formName,url,this.ruleForm);
        }

    }
  }
</script>

<style scoped>

 
</style>
