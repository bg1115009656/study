CREATE TABLE `ENT_INFO`(
`ENT_UUID`VARCHAR(33) NOT NULL PRIMARY KEY COMMENT '平台企业编号',
`ENT_ID` INT(33) NOT NULL AUTO_INCREMENT UNIQUE COMMENT '企业编号',
`ENT_NAME` VARCHAR(20) DEFAULT NULL COMMENT '企业名称',
`CERT_TYPE` VARCHAR(20) DEFAULT NULL COMMENT '证件类型（组织机构代码，企业社会信用代码）',
`CERT_CODE` VARCHAR(20) DEFAULT NULL COMMENT '证件号码',
`LEGAL_NAME` VARCHAR(20) DEFAULT NULL COMMENT '法人姓名',
`LEGAL_IDNO` VARCHAR(20) DEFAULT NULL COMMENT '法人身份证号',
`LEGAL_AREA` VARCHAR(20) DEFAULT NULL COMMENT '法人归属地',
`ADDRESS` VARCHAR(20) DEFAULT NULL COMMENT '公司地址',
`SCOPE` VARCHAR(20) DEFAULT NULL COMMENT '经营范围',
`ENT_ACCOUNT_NAME` VARCHAR(20) DEFAULT NULL COMMENT '公司对公银行账户名称',
`ENT_CARDNO` VARCHAR(20) DEFAULT NULL COMMENT '公司银行账户',
`ENT_SUBBRANCH` VARCHAR(20) DEFAULT NULL COMMENT '企业银行账号开户行支行名称',
`ENT_BANK` VARCHAR(20) DEFAULT NULL COMMENT '企业开户行名称',
`BANK_PROVICE` VARCHAR(20) DEFAULT NULL COMMENT '企业银行账号开户行所在省份',
`BANK_CITY` VARCHAR(20) DEFAULT NULL COMMENT '企业银行账号开户行所在城市',
`ENT_ACCOUNT_ID` VARCHAR(20) DEFAULT NULL COMMENT '企业e签宝账户标识',
`SERVICE_ID` VARCHAR(20) DEFAULT NULL COMMENT '实名认证成功服务id',
`NOTIFY_URL` VARCHAR(20) DEFAULT NULL COMMENT '打款完成接收地址',
`ENT_PRCPTCD` VARCHAR(20) DEFAULT NULL COMMENT '企业对公账户所在开户行的大额行号',
`PIZID` VARCHAR(20) DEFAULT NULL COMMENT '调用者业务id',
`PAYED_TIME` VARCHAR(20) DEFAULT NULL COMMENT '打款完成时间',
`APPROV_STATUS` VARCHAR(20) DEFAULT NULL COMMENT '企业对公打款认证状态',
`APPROV_FAIL_MSG` VARCHAR(20) DEFAULT NULL COMMENT '对公打款失败信息',
`ELE_SEAL` VARCHAR(20) DEFAULT NULL COMMENT '电子印章地址',
`STATUS` VARCHAR(20) DEFAULT 'VALID' COMMENT '数据状态（VALID:有效,INVALID:失效）',
`UPDATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`UPDATE_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
`CREATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;


CREATE TABLE `SIGN_ENT_INFO`(
`SIGN_ENT_ID` INT(33) NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '签约企业编号',
`SIGN_ENT_NAME` VARCHAR(20) DEFAULT NULL COMMENT '签约企业名称',
`ENT_ID` INT(33) NOT NULL COMMENT '归属企业编号',
`CERT_TYPE` VARCHAR(20) DEFAULT NULL COMMENT '证件类型（组织机构代码，企业社会信用代码）',
`CERT_CODE` VARCHAR(20) DEFAULT NULL COMMENT '证件号码',
`LEGAL_NAME` VARCHAR(20) DEFAULT NULL COMMENT '法人姓名',
`LEGAL_IDNO` VARCHAR(20) DEFAULT NULL COMMENT '法人身份证号',
`ENT_ACCOUNT_NAME` VARCHAR(20) DEFAULT NULL COMMENT '公司对公银行账户名称',
`ENT_CARDNO` VARCHAR(20) DEFAULT NULL COMMENT '公司银行账户',
`ENT_SUBBRANCH` VARCHAR(20) DEFAULT NULL COMMENT '企业银行账号开户行支行名称',
`ENT_BANK` VARCHAR(20) DEFAULT NULL COMMENT '企业开户行名称',
`BANK_PROVICE` VARCHAR(20) DEFAULT NULL COMMENT '企业银行账号开户行所在省份',
`BANK_CITY` VARCHAR(20) DEFAULT NULL COMMENT '企业银行账号开户行所在城市',
`ENT_ACCOUNT_ID` VARCHAR(20) DEFAULT NULL COMMENT '企业e签宝账户标识',
`SERVICE_ID` VARCHAR(20) DEFAULT NULL COMMENT '实名认证成功服务id',
`NOTIFY_URL` VARCHAR(20) DEFAULT NULL COMMENT '打款完成接收地址',
`ENT_PRCPTCD` VARCHAR(20) DEFAULT NULL COMMENT '企业对公账户所在开户行的大额行号',
`PIZID` VARCHAR(20) DEFAULT NULL COMMENT '调用者业务id',
`PAYED_TIME` VARCHAR(20) DEFAULT NULL COMMENT '打款完成时间',
`APPROV_STATUS` VARCHAR(20) DEFAULT NULL COMMENT '企业对公打款认证状态',
`APPROV_FAIL_MSG` VARCHAR(20) DEFAULT NULL COMMENT '对公打款失败信息',
`ELE_SEAL` VARCHAR(20) DEFAULT NULL COMMENT '电子印章地址',
`STATUS` VARCHAR(20) DEFAULT 'VALID' COMMENT '数据状态（VALID:有效,INVALID:失效）',
`UPDATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`UPDATE_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
`CREATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB AUTO_INCREMENT=100000 DEFAULT CHARSET=utf8;

CREATE TABLE `SIGN_ACCOUNT_INFO`(
`ACCOUNT_UUID`VARCHAR(33) NOT NULL PRIMARY KEY COMMENT '账户编号',
`ACCOUNT_USERNAME` VARCHAR(20) NOT NULL UNIQUE COMMENT '用户登录名',
`ACCOUNT_PASSWORD` VARCHAR(20) DEFAULT NULL COMMENT '登陆密码',
`ACCOUNT_ROLE` VARCHAR(20) DEFAULT NULL COMMENT '账户角色',
`BELONG_ENT_ID` INT(11) NOT NULL COMMENT '账号所属企业编号',
`E-MAIL` VARCHAR(20) DEFAULT NULL COMMENT '账户绑定邮箱',
`PHONE_NUMBER` VARCHAR(20) DEFAULT NULL COMMENT '账户绑定手机号',
`STATUS` VARCHAR(20) DEFAULT 'VALID' COMMENT '数据状态（VALID:有效,INVALID:失效）',
`UPDATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`UPDATE_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
`CREATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `SIGN_CONFIG`(
`SIGN_CONFIG_ID` INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '配置编号',
`SIGN_ENT_ID` INT(11) NOT NULL COMMENT '签约企业编号',
`ACCOUNT_ID` VARCHAR(20) DEFAULT NULL COMMENT '可签约账户',
`STATUS` VARCHAR(20) DEFAULT 'VALID' COMMENT '数据状态（VALID:有效,INVALID:失效）',
`UPDATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`UPDATE_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
`CREATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB AUTO_INCREMENT=100000 DEFAULT CHARSET=utf8;

CREATE TABLE `ROLE_INFO`(
`ROLE_ID` INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '角色编号',
`ROLE_NAME` VARCHAR(20) DEFAULT NULL COMMENT '角色名称',
`STATUS` VARCHAR(20) DEFAULT 'VALID' COMMENT '数据状态（VALID:有效,INVALID:失效）',
`UPDATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`UPDATE_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
`CREATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

CREATE TABLE `REVIEW_INFO`(
`REVIEW_UUID` VARCHAR(33) NOT NULL PRIMARY KEY COMMENT '平台审核唯一编号',
`REVIEW_ID` INT(11) NOT NULL AUTO_INCREMENT UNIQUE COMMENT '审核编号',
`APPLY_ENT_UUID` VARCHAR(33) NOT NULL COMMENT '应聘企业唯一id',
`UNION_ID` VARCHAR(33) NOT NULL COMMENT '角色唯一id',
`STAFF_NAME` VARCHAR(20) DEFAULT NULL COMMENT '员工姓名',
`STAFF_PLACE` VARCHAR(20) DEFAULT NULL COMMENT '员工户籍城市',
`PHONE_NUMBER` VARCHAR(20) DEFAULT NULL COMMENT '员工手机号',
`APPLY_JOB` VARCHAR(20) DEFAULT NULL COMMENT '应聘职位',
`REVIEW_STATUS` VARCHAR(20) DEFAULT NULL COMMENT '审核状态',
`STATUS` VARCHAR(20) DEFAULT 'VALID' COMMENT '数据状态（VALID:有效,INVALID:失效）',
`UPDATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`UPDATE_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
`CREATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

CREATE TABLE `TEMPLATE_FIELDS`(
`FIELD_ID` INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '字段编号',
`FIELD_NAME` VARCHAR(20) DEFAULT NULL COMMENT '字段名称',
`FIELD_TO_TPL` VARCHAR(20) DEFAULT NULL COMMENT '文本域对应模板字段',
`TEMPLATE_ID` VARCHAR(20) DEFAULT NULL COMMENT '模板编号',
`STATUS` VARCHAR(20) DEFAULT 'VALID' COMMENT '数据状态（VALID:有效,INVALID:失效）',
`UPDATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`UPDATE_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
`CREATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB AUTO_INCREMENT=100000 DEFAULT CHARSET=utf8;

CREATE TABLE `TEMPLATE_INFO`(
`TEMPLATE_ID` INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '模板编号',
`TEMPLATE_NAME` VARCHAR(20) DEFAULT NULL COMMENT '模板名称',
`TEMPLATE_PATH` VARCHAR(20) DEFAULT NULL COMMENT '模板路径',
`BELONG_ENT_ID` INT(11) NOT NULL COMMENT '所属企业编号',
`STATUS` VARCHAR(20) DEFAULT 'VALID' COMMENT '数据状态（VALID:有效,INVALID:失效）',
`UPDATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`UPDATE_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
`CREATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB AUTO_INCREMENT=100000 DEFAULT CHARSET=utf8;


CREATE TABLE `CONTRACT_INFO`(
`CONTRACT_UUID` VARCHAR(33) NOT NULL PRIMARY KEY COMMENT '合同编号',
`CONTRACT_ID` INT(11) NOT NULL AUTO_INCREMENT UNIQUE COMMENT '合同编号',
`SIGN_ENT` INT(11) DEFAULT NULL COMMENT '签约企业',
`SIGN_ENT_INFO` VARCHAR(20) DEFAULT NULL COMMENT '签约企业名称',
`UNION_ID` VARCHAR(20) DEFAULT NULL COMMENT '签署员工平台唯一id',
`STAFF_NAME` VARCHAR(20) DEFAULT NULL COMMENT '签署员工姓名',
`CONTRACT_TYPE` VARCHAR(20) DEFAULT NULL COMMENT '合同类型',
`BEGIN_DATE` VARCHAR(20) DEFAULT NULL COMMENT '合同开始日期',
`END_DATE` VARCHAR(20) DEFAULT NULL COMMENT '结束日期',
`SIGN_DATE` VARCHAR(20) DEFAULT NULL COMMENT '签署日期',
`CONTRACT_SAL` VARCHAR(20) DEFAULT NULL COMMENT '合同薪资',
`JOB_POST` VARCHAR(20) DEFAULT NULL COMMENT '工作岗位',
`JOB_CITY` VARCHAR(20) DEFAULT NULL COMMENT '工作城市',
`SIGN_STATUS` VARCHAR(20) DEFAULT NULL COMMENT '签约状态',
`STATUS` VARCHAR(20) DEFAULT 'VALID' COMMENT '数据状态（VALID:有效,INVALID:失效）',
`UPDATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`UPDATE_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
`CREATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

CREATE TABLE `MENU_INFO`(
`MENU_ID` INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '菜单编号',
`MENU_NAME` VARCHAR(20) DEFAULT NULL COMMENT '菜单名称',
`SORT_NO` VARCHAR(20) DEFAULT NULL COMMENT '菜单排序号',
`BELONG_ROLE` VARCHAR(20) DEFAULT NULL COMMENT '所对应角色（字段为空，默认为全权）',
`STATUS` VARCHAR(20) DEFAULT 'VALID' COMMENT '数据状态（VALID:有效,INVALID:失效）',
`UPDATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`UPDATE_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
`CREATE_USER` VARCHAR(20) DEFAULT NULL DEFAULT 'SYSTEM',
`CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB AUTO_INCREMENT=100000 DEFAULT CHARSET=utf8;


-- 示例建表

SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `job_entity`;
CREATE TABLE `job_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `group` varchar(255) DEFAULT NULL,
  `cron` varchar(255) DEFAULT NULL,
  `parameter` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `vm_param` varchar(255) DEFAULT NULL,
  `jar_path` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
INSERT INTO `job_entity` VALUES ('1',  'first', 'helloworld', '0/2 * * * * ? ', '1', '第一个', '', null, 'OPEN');
INSERT INTO `job_entity` VALUES ('2',  'second', 'helloworld', '0/5 * * * * ? ', '2', '第二个', null, null, 'OPEN');
INSERT INTO `job_entity` VALUES ('3',  'third', 'helloworld', '0/15 * * * * ? ', '3', '第三个', null, null, 'OPEN');
INSERT INTO `job_entity` VALUES ('4',  'four', 'helloworld', '0 0/1 * * * ? *', '4', '第四个', null, null, 'CLOSE');
INSERT INTO `job_entity` VALUES ('5',  'OLAY Job', 'Nomal', '0 0/2 * * * ?', '5', '第五个', null, 'C:\\EalenXie\\Download\\JDE-Order-1.0-SNAPSHOT.jar', 'CLOSE');