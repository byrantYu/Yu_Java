/*

�﷨��
	select 
		��ѯ�б�
	from
		����
	where
		ɸѡ����;

���ࣺ
	һ�����������ʽɸѡ
	
	�������������> < = != <> >= <=
	
	//SQL ����  ��    Mysql  mysql����  ,  Oracle  oracle���ԡ� SQL�﷨����Щϸ΢�Ĳ��
	
	�������߼����ʽɸѡ
	�߼��������
	���ã����������������ʽ
		&& || !
		
		and or not
		
	&&��and������������Ϊtrue�����Ϊtrue����֮Ϊfalse
	||��or�� ֻҪ��һ������Ϊtrue�����Ϊtrue����֮Ϊfalse
	!��not�� ������ӵ���������Ϊfalse�����Ϊtrue����֮Ϊfalse
	
	����ģ����ѯ
		like
		between and
		in
		
		is null
		<=> ��ȫ���ڡ�
	
	truncate ��delete ���� 
	sum �� count 
	where  having 
*/
#һ�����������ʽɸѡ

#����1����ѯ����>12000��Ա����Ϣ

SELECT 
	*
FROM
	employees
WHERE
	salary>12000;
	
	
#����2����ѯ���ű�Ų�����90�ŵ�Ա�����Ͳ��ű��
SELECT 
	last_name,
	department_id
FROM
	employees
WHERE
	department_id<>90;
#!=  <>����ʾ������ ��   


#�������߼����ʽɸѡ

#����1����ѯ����z��10000��20000֮���Ա�����������Լ�����
SELECT
	last_name,
	salary,
	commission_pct
FROM
	employees
WHERE
	salary>=10000 AND salary<=20000;
-- && and 
#����2����ѯ���ű�Ų�����90��110֮�䣬���߹��ʸ���15000��Ա����Ϣ
SELECT
	*
FROM
	employees
WHERE
	NOT(department_id>=90 AND  department_id<=110) OR salary>15000;
#����ģ����ѯ
/*
like

	
	
between and
in
is null|is not null

*/
#1.like
/*
�ص㣺
��һ���ͨ�������ʹ��
	ͨ�����
	% �������ַ�,����0���ַ�
	_ ���ⵥ���ַ�
*��

#����1����ѯԱ�����а����ַ�a��Ա����Ϣ

select 
	*
from
	employees
where
	last_name like '%a%';#abc
#����2����ѯԱ�����е������ַ�Ϊe��������ַ�Ϊa��Ա�����͹���
select
	last_name,
	salary
FROM
	employees
WHERE
	last_name LIKE '__e_a%';



#����3����ѯԱ�����еڶ����ַ�Ϊ_��Ա����

SELECT
	last_name
FROM
	employees
WHERE
	last_name LIKE '_$_%' ESCAPE '$'; 

	��ʹ��ת���ʱ�� ��Ҫʹ��ESCAPE '*'; �ؼ���  ��ָ��ת����ַ� ��
#2.between and
/*
��ʹ��between and ����������ļ���
�ڰ����ٽ�ֵ
�������ٽ�ֵ��Ҫ����˳��

*/


#����1����ѯԱ�������100��120֮���Ա����Ϣ

SELECT
	*
FROM
	employees
WHERE
	employee_id >= 120 AND employee_id<=100;
#----------------------
SELECT
	*
FROM
	employees
WHERE
	employee_id BETWEEN 120 AND 100;#ע�����˳��֮�����޷�������ݵġ�

#3.in
/*
 in (1,243,543,23,2,"1")
���壺�ж�ĳ�ֶε�ֵ�Ƿ�����in�б��е�ĳһ��
�ص㣺
	��ʹ��in���������
	��in�б��ֵ���ͱ���һ�»����
	��in�б��в�֧��ͨ���    * ��ʾ���� ��
	

*/
#��������ѯԱ���Ĺ��ֱ���� IT_PROG��AD_VP��AD_PRES�е�һ��Ա�����͹��ֱ��

SELECT
	last_name,
	job_id
FROM
	employees
WHERE
	job_id = 'IT_PROT' OR job_id = 'AD_VP' OR JOB_ID ='AD_PRES';


#------------------

SELECT
	last_name,
	job_id
FROM
	employees
WHERE
	job_id IN( 'IT_PROT' ,'AD_VP','AD_PRES');

#4��is null
/*
null �� ��������������������null .

=��<>���������ж�nullֵ
is null��is not null �����ж�nullֵ




*/

#����1����ѯû�н����Ա�����ͽ�����
SELECT
	last_name,
	commission_pct
FROM
	employees
WHERE
	commission_pct IS NULL;


#����1����ѯ�н����Ա�����ͽ�����
SELECT
	last_name,
	commission_pct
FROM
	employees
WHERE
	commission_pct IS NOT NULL;

/*
#----------����Ϊ�� ����ġ�
SELECT
	last_name,
	commission_pct
FROM
	employees

WHERE 
	salary is 12000; 
	����ʹ��is���жϾ�������֡� 
	���� ������
*/
	
#��ȫ����  <=>   <=>


#����1����ѯû�н����Ա�����ͽ�����
SELECT
	last_name,
	commission_pct
FROM
	employees
WHERE
	commission_pct=NULL;
	
	
#����2����ѯ����Ϊ12000��Ա����Ϣ
SELECT
	last_name,
	salary
FROM
	employees

WHERE 
	salary <=> 12000;
	

#is null pk <=>

IS NULL:���������ж�NULLֵ���ɶ��Խϸߣ�����ʹ��
<=>    :�ȿ����ж�NULLֵ���ֿ����ж���ͨ����ֵ���ɶ��Խϵ�
