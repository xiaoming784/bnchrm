import Vue from 'vue'
import Router from 'vue-router'
import Index from '@/components/index'
import Dept from '@/components/dept/list'
import Job from '@/components/job/list'
import Emp from '@/components/emp/list'
import Probation from '@/components/probation/list'
import DeptMob from '@/components/deptMob/list'
import JobMob from '@/components/jobMob/list'


Vue.use(Router)

export default new Router({
  mode:'history',
  routes: [
    {
        path:'/index',
        name:'index',
        component:Index,
        children:[
          {
            path:'/dept',
            name:'dept',
            component:Dept
          },
          {
            path:'/job',
            name:'job',
            component:Job
          },
          {
            path:'/emp',
            name:'emp',
            component:Emp
          },
          {
            path:'/probation',
            name:'probation',
            component:Probation
          },
          {
            path:'/deptMob',
            name:'deptMob',
            component:DeptMob
          },
          {
            path:'/jobMob',
            name:'jobMob',
            component:JobMob
          }
        ]
    }
  ]
})
