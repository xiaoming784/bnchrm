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
            <el-input :disabled="true" v-model="ruleForm.name"></el-input>
        </el-form-item>
        <el-form-item label="性别" prop="sex">
            <el-select :disabled="true" v-model="ruleForm.sex" placeholder="请选择活动区域">
                <el-option
                        v-for="item in sexOption"
                        :key="item.value"
                        :label="item.label"
                        :value="item.value"
                        >
                </el-option>
            </el-select>
        </el-form-item>
        <!-- 出生日期 -->
        <el-form-item label="出生日期" prop="birthday">
          <el-date-picker
            :disabled="true"
            v-model="ruleForm.birthday"
            type="date"
            placeholder="选择日期"
            value-format="yyyy-MM-dd">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="身份证号" prop="idCard">
            <el-input :disabled="true" v-model="ruleForm.idCard"></el-input>
        </el-form-item>
        <el-form-item label="部门" prop="dept">
            <el-select :disabled="true" v-model="ruleForm.dept" placeholder="请选择活动区域">
                <!-- <el-option
                        v-for="item in deptOption"
                        :key="item.value"
                        :label="item.label"
                        :value="item.value"
                        >
                </el-option> -->
                <el-option v-for="entry in depts" :label="entry.name" :value="entry.id" :key="entry.id"></el-option>
            </el-select>
        </el-form-item>
        <el-form-item label="岗位" prop="job">
            <el-select :disabled="true" v-model="ruleForm.job" placeholder="请选择活动区域">
                <!-- <el-option
                        v-for="item in jobOption"
                        :key="item.value"
                        :label="item.label"
                        :value="item.value"
                        >
                </el-option> -->
                <el-option v-for="entry in jobs" :label="entry.name" :value="entry.id" :key="entry.id"></el-option>
            </el-select>
        </el-form-item>
        <!-- 入职日期 -->
        <el-form-item label="入职日期" prop="createData">
          <el-date-picker
            :disabled="true"
            v-model="ruleForm.createData"
            type="date"
            placeholder="选择日期"
            value-format="yyyy-MM-dd">
          </el-date-picker>
        </el-form-item>
        <!-- 工作时间 -->
        <el-form-item label="工作时间" prop="jobDate">
          <el-date-picker
          :disabled="true"
            v-model="ruleForm.jobDate"
            type="date"
            placeholder="选择日期"
            value-format="yyyy-MM-dd">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="工作性质" prop="workType">
            <el-select :disabled="true" v-model="ruleForm.workType" placeholder="请选择活动区域">
                <el-option
                        v-for="item in workTypeOption"
                        :key="item.value"
                        :label="item.label"
                        :value="item.value"
                        >
                </el-option>
            </el-select>
        </el-form-item>
        <el-form-item label="招聘途径" prop="source">
            <el-select :disabled="true" v-model="ruleForm.source" placeholder="请选择活动区域">
                <el-option
                        v-for="item in sourceOption"
                        :key="item.value"
                        :label="item.label"
                        :value="item.value"
                        >
                </el-option>
            </el-select>
        </el-form-item>
        <el-form-item label="政治面貌" prop="politic">
            <el-select :disabled="true" v-model="ruleForm.politic" placeholder="请选择活动区域">
                <el-option
                        v-for="item in politicOption"
                        :key="item.value"
                        :label="item.label"
                        :value="item.value"
                        >
                </el-option>
            </el-select>
        </el-form-item>
        <el-form-item label="民族" prop="folk">
            <el-select :disabled="true" v-model="ruleForm.folk" placeholder="请选择活动区域">
                <el-option
                        v-for="item in folkOption"
                        :key="item.value"
                        :label="item.label"
                        :value="item.value"
                        >
                </el-option>
            </el-select>
        </el-form-item>
        <el-form-item label="籍贯" prop="nativePlace">
            <el-input   :disabled="true" v-model="ruleForm.nativePlace"></el-input>
        </el-form-item>
        <el-form-item label="手机号" prop="phone">
            <el-input :disabled="true"  v-model="ruleForm.phone"></el-input>
        </el-form-item>
        <el-form-item label="邮箱" prop="email">
            <el-input  :disabled="true" v-model="ruleForm.email"></el-input>
        </el-form-item>
        <el-form-item label="身高" prop="height">
            <el-input  :disabled="true" v-model="ruleForm.height"></el-input>
        </el-form-item>
        <el-form-item label="血型" prop="blood">
            <el-input   :disabled="true" v-model="ruleForm.blood"></el-input>
        </el-form-item>
        <el-form-item label="婚姻状况" prop="marriage">
            <el-select :disabled="true" v-model="ruleForm.marriage" placeholder="请选择活动区域">
                <el-option
                        v-for="item in marriageOption"
                        :key="item.value"
                        :label="item.label"
                        :value="item.value"
                        >
                </el-option>
            </el-select>
        </el-form-item>
        <el-form-item label="出生地" prop="birthPlace">
            <el-input :disabled="true"  v-model="ruleForm.birthPlace"></el-input>
        </el-form-item>
        <el-form-item label="户口地" prop="house">
            <el-input  :disabled="true" v-model="ruleForm.house"></el-input>
        </el-form-item> 
        <el-form-item label="学历" prop="degree">
            <el-select :disabled="true" v-model="ruleForm.degree" placeholder="请选择活动区域">
                <el-option
                        v-for="item in degreeOption"
                        :key="item.value"
                        :label="item.label"
                        :value="item.value"
                        >
                </el-option>
            </el-select>
        </el-form-item>
        <el-form-item label="学位" prop="diploma">
            <el-select :disabled="true" v-model="ruleForm.diploma" placeholder="请选择活动区域">
                <el-option
                        v-for="item in diplomaOption"
                        :key="item.value"
                        :label="item.label"
                        :value="item.value"
                        >
                </el-option>
            </el-select>
        </el-form-item>
        <el-form-item label="毕业院校" prop="school">
            <el-input :disabled="true"  v-model="ruleForm.school"></el-input>
        </el-form-item>
        <el-form-item label="专业" prop="spical">
            <el-input :disabled="true" v-model="ruleForm.spical"></el-input>
        </el-form-item>
        <el-form-item label="毕业时间" prop="graduateDate">
          <el-date-picker
          :disabled="true"
            v-model="ruleForm.graduateDate"
            type="date"
            placeholder="选择日期"
            value-format="yyyy-MM-dd">
          </el-date-picker>
        </el-form-item>
        <!-- <el-form-item>
            <el-button type="primary" @click="submitForm('ruleForm')">{{buttonText}}</el-button>
            <el-button @click="resetForm('ruleForm')">重置</el-button>
        </el-form-item> -->
        </el-form>
  </div>
</template>

<script>

  export default {
      inject:['reload'],
      props:["id"],
      
    data () {
        name:"talenPooledit"
      return {
          ruleForm:{
            id:"",
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
            active:""
          },
          pickerOptions: {
          disabledDate(time) {
            return time.getTime() > Date.now();
          }
        },
        depts:"",
        jobs:"",
        sexOption:[
          {value:0,
          label:'女'
          },
          {
            value:1,
            label:'男'
          }
        ],
        // deptOption:[
        //   {value:1,
        //   label:'开发部'
        //   },
        //   {
        //     value:2,
        //     label:'开发二部'
        //   },
        //   {
        //     value:3,
        //     label:'保洁部'
        //   },
        //   {
        //     value:4,
        //     label:'部门4'
        //   }
        // ],
        // jobOption:[
        //   {value:1,
        //   label:'Java开发工程师'
        //   },
        //   {
        //     value:2,
        //     label:'资深保洁员'
        //   }
        // ],
        workTypeOption:[
          {value:1,
          label:'正式工'
          },
          {
            value:2,
            label:'临时工'
          }
        ],
        sourceOption:[
          {value:1,
          label:'校招'
          },
          {
            value:2,
            label:'社招'
          },
          {
            value:3,
            label:'其他'
          }
        ],
        politicOption:[
          {value:1,
          label:'群众'
          },
          {
            value:2,
            label:'少先队'
          },
          {
            value:3,
            label:'共青团员'
          },{
            value:4,
            label:'共产党员'
          }
        ],
        folkOption:[
          {
            value:"1",
            label:'汉'
          },{
            value:"2",
            label:'少数民族'
          }
        ],
        marriageOption:[
          {value:1,
          label:'未婚'
          },
          {
            value:2,
            label:'已婚'
          },
          {
            value:3,
            label:'离异'
          },{
            value:4,
            label:'丧偶'
          }
        ],
        degreeOption:[
          {value:1,
          label:"高中以下"
          },
          {value:2,
          label:"大专"
          },
          {value:3,
          label:"本科"
          },
          {value:4,
          label:"研究生"
          }
        ],
        diplomaOption:[
          {
            value:1,
            label:'无学位',
          },
          {value:2,
          label:"学士"
          },
          {value:3,
          label:"双学士"
          },
          {value:4,
          label:"硕士"
          },
          {value:5,
          label:"博士"
          },
          {value:6,
          label:"博士后"
          }
        ],
        birthday: '',
        createData:'',
        jobDate:'',
        graduateDate:'',
          rules: {
            // name: [
            //     { required: true, message: '请输入部门名称', trigger: 'blur' },
            //     { min: 1, max: 20, message: '长度在 1 到 20 个字符', trigger: 'blur' }
            // ],
            sex: [
                { required: true, message: '请选择性别', trigger: 'blur' }
            ]
            // ,
            // idCard: [
            //     {  required: true, message: '请输入身份证号', trigger: 'blur' },
            //     { min: 18, max: 18, message: '长度在 1 到 20 个字符', trigger: 'blur' }
            // ],
            // dept: [
            //     {  required: true, message: '请输入部门id', trigger: 'blur' }
            // ]
        },
        buttonText:"创建"
        
      }
    },
    created(){
        if(this.id){
             this.get("talentPool/getOneTalent",(data)=>{
                this.ruleForm=data;
                console.log(this.ruleForm);
            },{id:this.id}); 
            // this.buttonText="入职"
        }
        this.get("talentPool/getDept",(data)=>{
            console.log(data+"GG");
            //this.jobs=data.jobs;
            this.depts=data;
        });
        this.get("talentPool/getJob",(data)=>{
            console.log(data+"GG");
            //this.jobs=data.jobs;
            this.jobs=data;
        });
           
    },
    components: {

    },
    methods:{
        resetForm(formName){
             this.$refs[formName].resetFields();}
        // },
        // submitForm(formName){
        //     let url="";
        //     if(this.empId){url="talenPool/add";}
                
        //     else{
        //       url="talentPool/add";
        //     }
        //         // url="emp/add";
        //     console.log(this.ruleForm)
        //     this.post(formName,url,this.ruleForm);
        // }

    }
  }
</script>

<style scoped>

 
</style>
