<template>
  <div>
    <div style="margin-top: 15px;">
      <el-row>
        <el-col :span="22">
          <el-input placeholder="请输入内容" v-model="search.name" @change="findData" class="input-with-select">
            <el-select v-model="search.results" style="width:100px" @change="findData" slot="prepend" placeholder="请选择">
              <el-option label="全部" value=""></el-option>
              <el-option label="试用期" value="0"></el-option>
              <el-option label="已转正" value="1"></el-option>
              <el-option label="延期" value="2"></el-option>
            </el-select>
            <el-button slot="append" icon="el-icon-search" @click="findData"></el-button>
          </el-input>
        </el-col>
      </el-row>
    </div>

    <el-table :data="tableData.list" border style="width: 100%">
      <el-table-column prop="eId" label="员工编号" width="150"></el-table-column>
      <el-table-column prop="name" label="姓名" width="150"></el-table-column>
      <el-table-column prop="deptInfo.deptName" label="部门" width="150"></el-table-column>
      <el-table-column prop="jobInfo.jobName" label="岗位" width="150"></el-table-column>
      <el-table-column prop="results" label="试用期状态" width="120" :formatter="probabationformat"></el-table-column>
      <el-table-column prop="trialBegin" label="试用期开始时间" width="120"></el-table-column>
      <el-table-column prop="trialEnd" label="试用期结束时间" width="120"></el-table-column>
      <el-table-column label="操作" >
        <template slot-scope="scope" >
          <el-button @click="edit(scope.row)" type="text" :disabled="checkbutton(scope.row)" size="small" >试用结束</el-button>
        </template>
      </el-table-column>
    </el-table>
    <el-pagination
      background
      layout="prev, pager, next"
      :total="tableData.total"
      :current-page="this.queryParams.pageNo"
      :page-size="this.queryParams.pagesize"
      @current-change="changePageNo"
    ></el-pagination>
  </div>
</template>

<script>
  import EditProbation from '@/components/probation/edit'
export default {
  inject: ["reload"],
  name: "emp",
  data() {
    return {
      search: {
        results: "",
        name: ""
      },
      queryParams: {
        pageNo: 1,
        pageSize: 10,
        results: "",
        name: ""
      },
      disable:"false",
      tableData: {}
    };
  },
  created() {
    this.getData();
  },
  watch: {
    queryParams: {
      handler: function() {
        this.getData();
      },
      deep: true
    }
  },
  mounted() {},
  methods: {
    getData() {
      this.get("emp/getemp",data => {
          this.tableData = data;
          console.log(this.tableData.list)
        },
        this.queryParams
      );
    },
    probabationformat(row, column, cellValue, index) {
      switch(cellValue){
        case 0:
          return "试用期";
          break;
        case 1:
          return "已转正";
          break;
        case 2:
          return "延期";
          break;
        case 3:
          return "未通过";
          break;
      }
    },
    changePageNo(i) {
      this.queryParams.pageNo = i;
    },
    findData() {
      this.queryParams.pageNo = 1;
      this.merge(this.search, this.queryParams);
    },
    checkbutton(row){
      switch(row.results){
        case 0:
          return false;
          break;
        case 2:
          return false;
          break;
        default:
          return true;
          break;
      }
      
    },
    edit(row){
             this.$layer.iframe({
                content: {
                    content: EditProbation, //传递的组件对象
                    parent: this,//当前的vue对象
                    data:{eId:row.eId}//props
                },
                area:['800px','600px'],
                title: '编辑',
                shadeClose: false,
                shade :true
            });
        }
  }
};
</script>

