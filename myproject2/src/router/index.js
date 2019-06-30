import Vue from 'vue'
import Router from 'vue-router'
import Index from '@/components/index'
import Dept from '@/components/dept/list'
import Emp from '@/components/emp/list'
import TalentPool from '@/components/talentPool/list'
import TalentPool2 from '@/components/talentPool2/list'
import { SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS } from 'constants';


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
          },{
            path:'/emp',
            name:'emp',
            component:Emp
          },{
            path:'/talentPool',
            name:'talentPool',
            component:TalentPool
          },{
            path:'/talentPool2',
            name:'talentPool2',
            component:TalentPool2
          }
        ]
    }
  ]
})
