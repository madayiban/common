/**
 * Created by madl on 2017/5/17.
 */
package obj.deepclone;

//深拷贝10万条数据

//Object实现Cloneable接口：       244ms 210 190 198 188 285 218 232 247 212
//读写流序列化方法：               8865 8283 9171 8313 8470 8956 9243 9097 9030 8769   9211ms 8964 8756 8269 8301 8679 8304 8873 8870 8435
//fastjson序列化方法：            1930 1915 2199 1913 1804 1882 1803 1877 1826 1796
//            1609ms 1595 1697 1924 2131 1873 1523 1884 1783 1659
//uk.com.robust-it库的cloning包：30204ms 29762 29562 29980 30230 29526 30368 31163 31096 31135
//cglib库：539,558,830,808,545,904,564,849,556,767
// 876ms 1039 987 698 966 962 964 666 591 712 709 709 595 616 642 913 721 682

//commons-beanutils库：
