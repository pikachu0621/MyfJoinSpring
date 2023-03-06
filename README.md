myf_join
======


*myf_user_table* 用户表
------------------------

| id  | user_img | user_sex | user_name |       user_grade       | user_limit |
|:---:|:--------:|:--------:|:---------:|:----------------------:|:----------:|
| id  |   用户头像   |   用户性别   |    用户名    | 0 普通用户 1 管理员 2 root管理员 |   用户是否拉黑   |   

<br/><br/><br/>





*myf_group_table* 用户创建的组表
------------------------

| id  |  user_id   | group_name | group_introduce | group_tag |
|:---:|:----------:|:----------:|:---------------:|:---------:|
| id  | 用户ID-谁是创建的 |     名字     |       介绍        |    其他     |

*myf_join_group_table* 用户加入的组表
------------------------

| id  |    user_id     | group_id |
|:---:|:--------------:|:--------:|
| id  | 用户ID-属于哪个用户的数据 | 组的ID-哪个组 |

<br/><br/><br/>



*myf_start_sign_table* 发起签到表
------------------------

| id  |   user_id    |  group_id   | sign_title | sign_content | sign_type                            | sign_key |
|:---:|:------------:|:-----------:|------------|--------------|--------------------------------------|----------|
| id  | 用户ID-哪个用户发起的 | 组的ID-在哪个组发起 | 标题-哪个组     | 内容-哪个组       | 签到类型- 0 无密码打卡 1 签到码打卡 2 二维码打卡 3 手势打卡 | 签到key-密码 | 

*myf_user_sign_table* 用户签到表
------------------------

| id  |    user_id     | sign_id | sign_complete | sign_time | 
|:---:|:--------------:|:-------:|---------------|-----------|
| id  | 用户ID-属于哪个用户的数据 |  签到ID   | 签到是否完成        | 签到时间      | 

*myf_user_sign_history_table* 签到记录表
------------------------

| id  |    user_id     | sign_id | sign_complete | sign_time | 
|:---:|:--------------:|:-------:|---------------|-----------|
| id  | 用户ID-属于哪个用户的数据 |  签到ID   | 签到是否完成        | 签到时间      |

<br/><br/><br/>

