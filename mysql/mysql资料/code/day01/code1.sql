/*
�﷨��
select ��ѯ�б� from ����;


�����ڣ�System.out.println(��ӡ����);

�ص㣺

1����ѯ�б�����ǣ����е��ֶΡ�����ֵ�����ʽ������
2����ѯ�Ľ����һ������ı��
*/

USE myemployees;

#1.��ѯ���еĵ����ֶ�

SELECT last_name FROM employees;

#2.��ѯ���еĶ���ֶ�
SELECT last_name,salary,email FROM employees;

#3.��ѯ���е������ֶ�

#��ʽһ��
SELECT 
    `employee_id`,
    `first_name`,
    `last_name`,
    `phone_number`,
    `last_name`,
    `job_id`,
    `phone_number`,
    `job_id`,
    `salary`,
    `commission_pct`,
    `manager_id`,
    `department_id`,
    `hiredate` 
FROM
    employees ;
#��ʽ����  
 SELECT * FROM employees;
 
 #4.��ѯ����ֵ
 SELECT 100;
 SELECT 'john';
 
 #5.��ѯ���ʽ
 SELECT 100%98;
 
 #6.��ѯ����
 
 SELECT VERSION();
 
 
 #7.�����
 /*
 �ٱ������
 �����Ҫ��ѯ���ֶ��������������ʹ�ñ����������ֿ���
 
 */
 #��ʽһ��ʹ��as
SELECT 100%98 AS ���;
SELECT last_name AS ��,first_name AS �� FROM employees;

#��ʽ����ʹ�ÿո�
SELECT last_name ��,first_name �� FROM employees;


#��������ѯsalary����ʾ���Ϊ out put
SELECT salary AS "out put" FROM employees;
#Ҫȡ�ı����ж�����ʵ�ʱ�򣬿���ʹ��˫���š�
-- 
/*s */

#8.ȥ��


#��������ѯԱ�������漰�������еĲ��ű��
SELECT DISTINCT department_id FROM employees;


#9.+�ŵ�����

/*

java�е�+�ţ�
���������������������Ϊ��ֵ��
�����ӷ���ֻҪ��һ��������Ϊ�ַ���

mysql�е�+�ţ�
����ֻ��һ�����ܣ������

select 100+90; ������������Ϊ��ֵ�ͣ������ӷ�����
select '789'+90;ֻҪ����һ��Ϊ�ַ��ͣ���ͼ���ַ�����ֵת������ֵ��
			���ת���ɹ�����������ӷ�����
select 'john'+90;	���ת��ʧ�ܣ����ַ�����ֵת����0

select null+10; ֻҪ����һ��Ϊnull�������϶�Ϊnull

null ���κ��������㶼��null
*/

#��������ѯԱ�����������ӳ�һ���ֶΣ�����ʾΪ ����


SELECT CONCAT('a','b','c') AS ���;

SELECT 
	CONCAT(last_name,first_name) AS ����
FROM
	employees;