<template>
  <div style="min-height: 100%">
    <el-container style="height:100vh;">
      <el-aside width="200px" style="background-color: rgb(238, 241, 246)">

      </el-aside>

      <el-main>
        <div style="padding:10px 0">
          <label>评价人</label>
          <input type="text" >

          <label>预约编号</label>
          <input type="text"  id="car_store" value="yy135465775">

          <el-button class="ml-5" type="primary">搜索</el-button>
        </div>

        <div style="padding:10px 0">
          <el-button type="primary">新增 <i class="el-icon-circle-plus-outline"></i></el-button>
        </div>
        <div id="light" class="pop_win">
          <div  class="panel-body" id="container1" align="center" itemref="container1">
            <table>
              <tr><td><p>照片</p><img src="./../assets/images/1.jpg"></td></tr>
              <tr><td><label for="wp_name">评价</label><textarea cols="200" rows="20">
老板做人做事太实在了，很少有他家洗车这么细心的！肉眼可见的洗车效果，又亮又干净，总之就是非常nice！环境不错,交通也方便,价格实惠服务好,值得推荐，真心可以选择这家，已经推荐了几个同事去洗车。仅仅用这篇点评，献给这个五星洗车店铺！！！</textarea></td></tr>
              <tr><td><el-button type="danger" @click="closeWin()">关闭</el-button></td></tr>
            </table>
          </div>
        </div>
        <el-table :data="tableData" border stripe :header-cell-class-name="headerBg">
          <el-table-column prop="img" label="照片" width="250">
            <template v-slot="scope">
              <el-image :src="scope.row.img"/>
            </template>
          </el-table-column>
          <el-table-column prop="price" label="评价" width="300">
          </el-table-column>
          <el-table-column prop="wp_description" label="评价人" width="150">
          </el-table-column>
          <el-table-column prop="wp_name" label="预约编号" width="150">
          </el-table-column>
          <el-table-column label="操作">
            <template slot-scope="scope">
              <el-button type="warning" @click="checkDetail(scope.row)">查看详情</el-button>
              <el-button type="danger">删除</el-button>
            </template>
          </el-table-column>
        </el-table>
        <div style="padding: 10px 0">
          <el-pagination
              :page-sizes="[5, 10, 15, 20]"
              :page-size="10"
              layout="total, sizes, prev, pager, next, jumper"
              :total="total">
          </el-pagination>

        </div>
      </el-main>
    </el-container>
  </div>
</template>
<style scoped>
.pop_win {
  display: none;
  position: absolute;
  top: 10%;
  left: 20%;
  width: 60%;
  height: 75%;
  padding: 10px;
  border: 2px solid #3b3e41;
  background-color: white;
  z-index: 9999;
  overflow: auto;
  border-radius: 25px;
}
</style>


<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'HomeView',

  data()
  {
    return{

      tableData: [//存储的所有数据
        {wp_name:'yy05857444',price:'老板做人做事太实在了，很少有他家洗车这么细心的！肉眼可见的洗车效果，又亮又干净，总之就是非常nice！环境不错,交通也方便,价格实惠服务好,值得推荐，真心可以选择这家，已经推荐了几个同事去洗车。仅仅用这篇点评，献给这个五星洗车店铺！！！',img:'https://tse3-mm.cn.bing.net/th/id/OIP-C.2czLPBLKielPOyhsiN2hdgHaFj?w=263&h=198&c=7&r=0&o=5&dpr=1.2&pid=1.7',wp_description:'akali'},
        //{wp_name:'yy05857444',price:'老板做人做事太实在了，很少有他家洗车这么细心的！肉眼可见的洗车效果，又亮又干净，总之就是非常nice！环境不错,交通也方便,价格实惠服务好,值得推荐，真心可以选择这家，已经推荐了几个同事去洗车。仅仅用这篇点评，献给这个五星洗车店铺！！！',img:'https://tse1-mm.cn.bing.net/th/id/OIP-C.QlRgkwb4SdNUqPOMqlkepAHaFj?w=245&h=183&c=7&r=0&o=5&dpr=1.2&pid=1.7',wp_description:'好好好这么晚十八'},
      ]
    }
  },
  // created() {
  //   //请求分页查询数据
  //   fetch("http://localhost:9090/t_washproject/page?pageNum=1&pageSize=2").then(res =>res.json()).then(res =>{
  //     console.log(res)
  //     this.tableData = res.data
  //   })
  // }

  methods:{
    checkDetail(val){
      this.popWin();
    },
    popWin() {
      document.getElementById('light').style.display = 'block';
      document.getElementById('fade').style.display = 'block'
    },
    closeWin() {
      document.getElementById('light').style.display = 'none';
      document.getElementById('fade').style.display = 'none'
    },


  }

}

</script>

<style>
.headerBg{
  background: #ccc!important;}

</style>