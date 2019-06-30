import axios from 'axios'
import { Message,Loading,MessageBox } from 'element-ui';
export default {
  get:function(url,callback,params={}){
    let myloading= Loading.service();
     axios.get(url,{
      params:params
    }).then((result)=>{
      callback(result.data);
    }).catch(err=>{
      Message({
        showClose: true,
        message: err,
        type: 'error'
      });
    }).finally(()=>{
      myloading.close();
    })
  },
  post:function(url,paramsdata,callback,config={}){
    let formData=new FormData();
    for(let j in paramsdata){
      formData.append(j,paramsdata[j]);
    }
    let myloading= Loading.service();
     axios.post(url,formData,config).then(result=>{
      let type=result.data.code==1?"success":"error";
      Message({
        message: result.data.message,
        type:type
      });
      callback(result.data);
    }).catch(err=>{
      Message({
        showClose: true,
        message: err,
        type: 'error'
      });
    }).finally(()=>{
      myloading.close();
    })
  },
  merge:function(source,target){
    for(let k in source){
      target[k]=source[k];
    }
  },
  del:function(id,status,callback){
    let _selt=this;
    // switch(status){
    //   case 0:{let isDel=1; let txt="确定要恢复该数据吗";break;}
    //   case 1:{let isDel=0;let txt="确定要删除该数据吗";break;}
    //   case 2:{let isDel=2;let txt="又说那话";break;}
    // }
    let isDel;
    let txt;
    if(status==0){isDel=1;txt="确定要恢复该数据吗";}
    else if(status==1){isDel=0;txt="确定要删除该数据吗";}
    else if(status==2){isDel=2;txt="又说那话";}
    console.log(isDel,status,"666");
    //let isDel=status==1?0:1;
    //let txt=status==1?"确定要删除该数据吗？":"确定要恢复该数据吗";
    MessageBox.confirm(txt,'提示',{
      confirmButtonText: '确定',
      cancelButtonText: '取消',
      type: 'warning'
    }).then(()=>{
      callback(id,isDel);
    }).catch(()=>{});
  }
}
