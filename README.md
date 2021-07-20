# FizzBuzz tasking
## 创建一个对象GameNumber完成转化逻辑，输出字符串
    * input 1    output  "1"
    * input 3    output  "Fizz"
    * input 5    output  "Buzz"
    * input 15   output   "FizzBuzz"
    
## 创建一个列表对象game，盛放转化前数据和转化后的结果

   * input 100  output  100   game.get(0) = "1"   ....
   
## 将转化后的结果打印出来 

常见套路
1.第一个测试：验证可以创建对象，并验证对象最简单的行为
eg1： should_create_game_number_from_raw_number
eg2:  should_create_game_object_with_given_size
2.对于要处理的问题，我首先创建一个对象，并且验证这个对象包含某些东西
eg: Game game = new Game(100)   game.size()  ==  100


TDD编程原则：
1.没有失败的测试就不允许修改产品代码
2.只允许做恰好让测试通过的修改
3.在保证不改变软件行为的前提下，可以对代码进行重构，消除其中的坏味道


