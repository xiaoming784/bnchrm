<template>
  <div>
      <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
          <!-- <template>
  <div class="block">
    <span class="demonstration">默认</span>
    <el-date-picker
      v-model="value1"
      type="date"
      placeholder="选择日期">
    </el-date-picker>
  </div>
  </template> -->
        <el-form-item label="姓名" prop="name">
            <el-input v-model="ruleForm.name"></el-input>
        </el-form-item>
        <el-form-item label="性别" prop="sex">
            <el-select v-model="ruleForm.sex" placeholder="请选择活动区域">
                <el-option label="女" value="0"></el-option>
                <el-option label="男" value="1"></el-option>
            </el-select>
        </el-form-item>
        <!-- 出生日期 -->
        <el-form-item label="出生日期" prop="birthday">
          <el-date-picker
            v-model="ruleForm.birthday"
            type="date"
            placeholder="选择日期"
            value-format="yyyy-MM-dd">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="身份证号" prop="idCard">
            <el-input v-model="ruleForm.idCard"></el-input>
        </el-form-item>
        <el-form-item label="部门" prop="dept">
            <el-input v-model="ruleForm.dept"></el-input>
        </el-form-item>
        <el-form-item label="岗位" prop="job">
            <el-input type="textarea" v-model="ruleForm.job"></el-input>
        </el-form-item>
        <!-- 入职日期 -->
        <el-form-item label="入职日期" prop="createData">
          <el-date-picker
            v-model="ruleForm.createData"
            type="date"
            placeholder="选择日期"
            value-format="yyyy-MM-dd">
          </el-date-picker>
        </el-form-item>
        <!-- 工作时间 -->
        <el-form-item label="工作时间" prop="jobDate">
          <el-date-picker
            v-model="ruleForm.jobDate"
            type="date"
            placeholder="选择日期"
            value-format="yyyy-MM-dd">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="工作性质" prop="workType">
            <el-input   v-model="ruleForm.workType"></el-input>
        </el-form-item>
        <el-form-item label="招聘途径" prop="source">
            <el-input   v-model="ruleForm.source"></el-input>
        </el-form-item>
        <el-form-item label="政治面貌" prop="politic">
            <el-input   v-model="ruleForm.politic"></el-input>
        </el-form-item>
        <el-form-item label="民族" prop="folk">
            <el-input   v-model="ruleForm.folk"></el-input>
        </el-form-item>
        <el-form-item label="籍贯" prop="nativePlace">
            <el-input   v-model="ruleForm.nativePlace"></el-input>
        </el-form-item>
        <el-form-item label="手机号" prop="phone">
            <el-input   v-model="ruleForm.phone"></el-input>
        </el-form-item>
        <el-form-item label="邮箱" prop="email">
            <el-input   v-model="ruleForm.email"></el-input>
        </el-form-item>
        <el-form-item label="身高" prop="height">
            <el-input   v-model="ruleForm.height"></el-input>
        </el-form-item>
        <el-form-item label="血型" prop="blood">
            <el-input   v-model="ruleForm.blood"></el-input>
        </el-form-item>
        <el-form-item label="婚姻状况" prop="marriage">
            <el-input   v-model="ruleForm.marriage"></el-input>
        </el-form-item>
        <el-form-item label="出生地" prop="birthPlace">
            <el-input   v-model="ruleForm.birthPlace"></el-input>
        </el-form-item>
        <el-form-item label="户口地" prop="house">
            <el-input   v-model="ruleForm.house"></el-input>
        </el-form-item> 
        <el-form-item label="学历" prop="degree">
            <el-input   v-model="ruleForm.degree"></el-input>
        </el-form-item>
        <el-form-item label="学位" prop="diploma">
            <el-input   v-model="ruleForm.diploma"></el-input>
        </el-form-item>
        <el-form-item label="毕业院校" prop="school">
            <el-input   v-model="ruleForm.school"></el-input>
        </el-form-item>
        <el-form-item label="专业" prop="spical">
            <el-input   v-model="ruleForm.spical"></el-input>
        </el-form-item>
        <el-form-item label="毕业时间" prop="graduateDate">
          <el-date-picker
            v-model="ruleForm.graduateDate"
            type="date"
            placeholder="选择日期"
            value-format="yyyy-MM-dd">
          </el-date-picker>
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
      props:["empId"],
      
    data () {
        name:"empedit"
      return {
          ruleForm:{
            empId:"",
            name:"",
            sex:"",
            birthday:'',
            idCard:"",
            dept:"",
            job:"",
            createData:'',
            jobDate:'',
            workType:"",
            source:"",
            politic:"",
            folk:"",
            nativePlace:"",
            phone:"",
            email:"",
            height:"",
            blood:"",
            marriage:"",
            birthPlace:"",
            house:"",
            degree:"",
            diploma:"",
            school:"",
            spical:"",
            graduate_date:'',
          },
          pickerOptions: {
          disabledDate(time) {
            return time.getTime() > Date.now();
          }
        },
        birthday: '',
        createData:'',
        jobDate:'',
        graduateDate:'',
          rules: {
            name: [
                { required: true, message: '请输入部门名称', trigger: 'blur' },
                { min: 1, max: 20, message: '长度在 1 到 20 个字符', trigger: 'blur' }
            ],
            sex: [
                { required: true, message: '请选择性别', trigger: 'blur' }
            ],
            idCard: [
                {  required: true, message: '请输入身份证号', trigger: 'blur' }
            ],
            dept: [
                {  required: true, message: '请输入部门id', trigger: 'blur' }
            ]
        },
        buttonText:"创建"
        
      }
    },
    created(){
        if(this.empId){
             this.get("emp/getOne",(data)=>{
                this.ruleForm=data;
                console.log(this.ruleForm);
            },{empId:this.empId}); 
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
            if(this.empId)
                url="emp/update";
            else{
              url="emp/add";
            }
                // url="emp/add";
            console.log(this.ruleForm)
            this.post(formName,url,this.ruleForm);
        }

    }
  }
</script>

<style scoped>

 
</style>
