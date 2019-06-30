<template>
  <div>
      <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
        <!-- <el-form-item label="员工姓名" prop="empName">
            <el-input v-model="ruleForm.empName"></el-input>
        </el-form-item>
         <el-form-item label="所属部门ID" prop="deptId">
            <el-input v-model="ruleForm.empName"></el-input>
        </el-form-item> -->
        <el-form-item label="开始日期" prop="beginData">
           <el-date-picker
                v-model="ruleForm.beginData"
                type="date"
                placeholder="选择日期"
                value-format="yyyy-MM-dd">
            </el-date-picker>
        </el-form-item>
        <el-form-item label="结束日期" prop="endData">
           <el-date-picker
                v-model="ruleForm.endData"
                type="date"
                placeholder="选择日期"
                value-format="yyyy-MM-dd">
            </el-date-picker>
        </el-form-item>
        <el-form-item label="单位名称" prop="unitName">
            <el-input v-model="ruleForm.unitName"></el-input>
        </el-form-item>
        <el-form-item label="工作内容" prop="workers">
            <el-input v-model="ruleForm.workers"></el-input>
        </el-form-item>
        <el-form-item label="职务" prop="post">
            <el-input v-model="ruleForm.post"></el-input>
        </el-form-item>
        <el-form-item label="薪水" prop="salary">
            <el-input v-model="ruleForm.salary"></el-input>
        </el-form-item>
        <el-form-item label="证明人" prop="witness">
            <el-input v-model="ruleForm.witness"></el-input>
        </el-form-item>
        <el-form-item label="证明人职务" prop="witJob">
            <el-input v-model="ruleForm.witJob"></el-input>
        </el-form-item>
        <el-form-item label="证明人电话" prop="witPhone">
            <el-input   v-model="ruleForm.witPhone"></el-input>
        </el-form-item>
        <el-form-item label="备注" prop="remarks">
            <el-input type="textarea" v-model="ruleForm.remarks"></el-input>
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
        name:"careeredit"
      return {
          ruleForm:{
            id:"",
            // empName:"",
            // deptId:"",
            beginData:"",
            endData:"",
            unitName:"",
            workers:"",
            post:"",
            salary:"",
            witness:"",
            witJob:"",
            witPhone:"",
            remarks:""
          },
          rules: {
            // empName: [
            //     { required: true, message: '请输入员工名称', trigger: 'blur' }
            // ],
            beginData: [
                { required: true, message: '请选择开始日期', trigger: 'blur' }
                
            ],
            endData: [
                { required: true, message: '请选择截止日期', trigger: 'blur' }
               
            ],
            unitName: [
                { required: true, message: '请输入单位名称', trigger: 'blur' }
            ],
            workers: [
                {  required: true, message: '请输入工作内容', trigger: 'blur' }
            ],
            post: [
                {  required: true, message: '请输入担任职务', trigger: 'blur' }
            ],
            salary: [
                {  required: true, message: '请输入薪资', trigger: 'blur' }
            ],
            witness: [
                {  required: true, message: '请输入证明人', trigger: 'blur' }
            ],
            witJob: [
                {  required: true, message: '证明人职务', trigger: 'blur' }
            ],
            witPhone: [
                {  required: true, message: '证明人电话', trigger: 'blur' }
            ],
            remarks: [
                {  required: true, message: '请输入备注', trigger: 'blur' }
            ]
        },
        buttonText:"创建"
        
      }
    },
    created(){
        if(this.id){
             this.get("career/getOne",(data)=>{
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
            console.log(formName);
            if(this.id)
                url="career/update";
            else
                url="career/add";
            this.post(formName,url,this.ruleForm);
        }

    }
  }
</script>

<style scoped>

 
</style>
