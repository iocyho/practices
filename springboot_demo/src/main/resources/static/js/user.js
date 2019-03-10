new Vue({
   el:"#app",
   data:{
       user:{
           id:"",
           username:"",
           password:"",
           sex:"",
           age:"",
           email:""
       },
       userList:[]
   },
   methods:{
     findAll:function () {
         var _this = this;
         axios.get('/practice/user/list').then(function (value) {
             _this.userList = value.data;
         }).catch(function (reason) {
             console.log(reason);
         });
     },
     findById:function (userId) {
         var _this = this;
         // axios.get('../static/user/findById.do',{params:{id:userId}}).then(function (value) {
         axios.get('/practice/user/get/'+userId).then(function (value) {
             _this.user = value.data;
             $("#myModal").modal('show');
         }).catch(function (reason) {
            console.log(reason);
         });
     },
     update:function () {
         var _this = this;
         axios.post('/practice/user/save',_this.user).then(function (value) {
             _this.findAll();
         }).catch(function (reason) {
             console.log(reason);
         })
     }
   },
   created:function () {
       this.findAll();
   }
});