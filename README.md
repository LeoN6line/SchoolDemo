
# SchoolDemo

1.系统说明
原生态的Java web小系统
这个小系统使用的是Java web原生态的Servlet Jsp Dao 等技术完成的一个简单的学生选课管理系统

2.系统功能
  
  2-1.功能目标：对某一个学期的教务进行管理，包含以下三种角色
    
    2-1-1.管理员：
    学生信息维护增删改
    课程（包含上课时间和地点,时间地点不能冲突）信息维护增删改
    教师信息维护增删改
    教室信息维护增删改

    2-1-2.学生：
    选课功能，浏览检索查看课程信息，并选课（要求每门课人数不超过30，上课时间不能冲突）
    课表查询，查询自己一周的课表（要求课程信息里有上课时间和地点）
    成绩查询，查询自己课程的成绩，并统计平均绩点
    教师评价，可以对课程老师写评语并打分
    答疑功能，按课程可以在线向老师提问，如教师回答了，在首页可以提示有一条新的提问被回答待查看，一旦查看该回答后不再提示。选了该课才能提问

    2-1-3.教师：
    录入自己的课程成绩，可能同时上多门课。
    查看学生对自己每门课的评分
    按课程可以分别查看学生的提问，并做答。在教师登录的首页里应该显示待回答的问题数量。
