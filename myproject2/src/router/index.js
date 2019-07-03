import Vue from 'vue'
import Router from 'vue-router'
import Index from '@/components/index'
import Dept from '@/components/dept/list'
import Job from '@/components/job/list'
import Table from '@/components/table/newList'
import Quit from '@/components/table/quitList'
import Deptlist from '@/components/table/deptList'
import Joblist from '@/components/table/jobList'
import Reportlist from '@/components/table/reportList'
import Notice from '@/components/notice/list'
import Login from '@/components/login'
import Probation from '@/components/probation/list'
import DeptMob from '@/components/deptMob/list'
import JobMob from '@/components/jobMob/list'
import Emp from '@/components/emp/list'
import TalentPool from '@/components/talentPool/list'
import TalentPool2 from '@/components/talentPool2/list'
import { SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS } from 'constants';
import Career from '@/components/career/list'
import Foreign_Languages from '@/components/foreign_languages/list'
import Family from '@/components/family/list'



Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [{
    path: '/login',
    name: 'login',
    component: Login
  },
  {
    path: '/index',
    name: 'index',
    component: Index,
    children: [
      {
        path: '/dept',
        name: 'dept',
        component: Dept
      },
      {
        path: '/job',
        name: 'job',
        component: Job
      },
      {
        path: '/table',
        name: 'table',
        component: Table
      },
      {
        path: '/quit',
        name: 'quit',
        component: Quit
      },
      {
        path: '/deptlist',
        name: 'deptlist',
        component: Deptlist
      },
      {
        path: '/joblist',
        name: 'joblist',
        component: Joblist
      },
      {
        path: '/reportlist',
        name: 'reportlist',
        component: Reportlist
      },
      {
        path: '/notice',
        name: 'notice',
        component: Notice
      },
      {
        path: '/probation',
        name: 'probation',
        component: Probation
      },
      {
        path: '/deptMob',
        name: 'deptMob',
        component: DeptMob
      },
      {
        path: '/jobMob',
        name: 'jobMob',
        component: JobMob
      },
      {
        path: '/emp',
        name: 'emp',
        component: Emp
      },
      {
        path: '/talentPool',
        name: 'talentPool',
        component: TalentPool
      }, {
        path: '/talentPool2',
        name: 'talentPool2',
        component: TalentPool2
      },
      {
        path: '/career',
        name: 'career',
        component: Career
      },
      {
        path: '/foreign_languages',
        name: 'foreign_languages',
        component: Foreign_Languages
      },
      {
        path: '/family',
        name: 'family',
        component: Family
      }
    ]
  }
  ]
})
