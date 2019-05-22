# NeverGetMeWeb


__博客采用的框架__：SpringBoot+MyBatis+MySQL+Redis

__使用的服务器__: 阿里云的学生服务器，1核2G内存1M带宽

__目前实现的功能__：用户邮箱注册，博客列表展示，按照标签分类，查看统计数据，简单后台管理以及使用Markdown语法编辑博客

## 页面展示
* 首页
  ![](https://github.com/hTangle/NeverGetMeWeb/blob/master/pic/20190522100555.png)
* 文章编辑界面
  ![](https://github.com/hTangle/NeverGetMeWeb/blob/master/pic/20190522101124.png)
* 统计界面
  ![](https://github.com/hTangle/NeverGetMeWeb/blob/master/pic/20190522101147.png)
* 后台管理界面
  ![](https://github.com/hTangle/NeverGetMeWeb/blob/master/pic/20190522101225.png)


## 更新2019-05-15
* 需要增加通过标签读取文章的功能

## 更新 2019-05-07
* 新增了评论功能

## 更新 2019-05-03
* 新增了注册界面
* 能够通过邮箱注册

## 更新 2019-05-02
* 更改了container样式，能够显示阴影
* 更改了header和footer的颜色
* 增加了标签内容
* 修改了博文其他信息的显示方式
* 修复了不能够连续ctrl+v上传图片的bug
* 可用通过https访问网站

## 更新2019-05-01
* 去掉Spring Security，使用HttpSession
## 更新2019-04-30
* 将head和footer分离
* 引入redis缓存：
  * 缓存每一篇文章，首先从缓存中读取，如果缓存中没有
  * 则从数据库中读取并加入缓存
  * 如果新建文章，则更新缓存
* 使用docker部署

## 更新 2019-04-29
* 增加了已读数功能
* 增加了页脚footer
* 如果当前文章数少于5则将页脚固定在页面底部，大于等于5固定在容器底部
* 增加了一些新的图标：日期，喜欢，阅读数
* 更改了文章的排序方法，安装id倒序
* 增加了分页插件
* 增加了Ctrl+V上传图片功能
* 增加Spring Security认证


