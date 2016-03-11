<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>增加车型</title>

<script src="${pageContext.request.contextPath}/script/jquery-2.1.4.js"></script>
<script>
	$(function() {

		$("#vehicleAction_add").click(function() {

			var base = "";
			$("#base").find("input").each(function() {
				base = base + "," + $(this).val();
			});

			alert(base);
			$("input[name=v_Param\\.base]").val(base);
			//$("input[type=hidden]").val(base);
			alert($("input[type=hidden]").val());

			//$("#dataForm").submit();

		});

	});
</script>


</head>

<body>

	<s:form id="dataForm"
		action="vehicleAction_test"
		method="post">

		<input type="hidden" name="v_Param.base" value="">


		<div id="column_1">
			<div>
				<h2>品牌</h2>
				<input type="text" name="v_Brand.name" value=""
					id="vehicleAction_add_v_Brand_name" />
			</div>
		</div>

		<div id="column_2">
			<div>
				<h2>车型</h2>
				<input type="text" name="v_Type" value=""
					id="vehicleAction_add_v_Type_name" />
			</div>
		</div>

		<div id="column_3">
			<div>
				<h2>配置</h2>
				<input type="text" name="v_Configure" value=""
					id="vehicleAction_add_v_Configure_name" />
			</div>
		</div>

	</s:form>


	<div>
		<div>
			<h3>基本参数</h3>
		</div>
		<div>
			<table cellpadding="0" cellspacing="1">
				<tbody>
					<tr>
						<td>车型</td>
						<td><input type="text" /></td>
					</tr>
					<tr>
						<td>指导价</td>
					</tr>
					<tr>
						<td>市场报价</td>
					</tr>
					<tr>
						<td>生产时间(年式)</td>
					</tr>
					<tr>
						<td>发动机位置</td>
					</tr>
					<tr>
						<td>驱动形式</td>
					</tr>
					<tr>
						<td>等速油耗(L/100km)</td>
					</tr>
					<tr>
						<td>综合油耗(L/100km)</td>
					</tr>
					<tr>
						<td>工信部油耗(L/100km)市郊</td>
					</tr>
					<tr>
						<td>工信部油耗(L/100km)市区</td>
					</tr>
					<tr>
						<td>工信部油耗(L/100km)综合</td>
					</tr>
					<tr>
						<td>最高车速(km/h)</td>
					</tr>
					<tr>
						<td>整车质保</td>
					</tr>
					<tr>
						<td>保养周期</td>
					</tr>
					<tr>
						<td>首保里程</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div>
			<div>
				<h3>车身参数</h3>
			</div>
		</div>
		<div>
			<table cellpadding="0" cellspacing="1">
				<tbody>
					<tr>
						<td>长</td>
					</tr>
					<tr>
						<td>宽</td>
					</tr>
					<tr>
						<td>高</td>
					</tr>
					<tr>
						<td>轴距</td>
					</tr>
					<tr>
						<td>前轮距</td>
					</tr>
					<tr>
						<td>后轮距</td>
					</tr>
					<tr>
						<td>最小离地间隙</td>
					</tr>
					<tr>
						<td>整备质量</td>
					</tr>
					<tr>
						<td>承载质量</td>
					</tr>
					<tr>
						<td>车身结构</td>
					</tr>
					<tr>
						<td>车门数</td>
					</tr>
					<tr>
						<td>座位排数</td>
					</tr>
					<tr>
						<td>座位数</td>
					</tr>
					<tr>
						<td>油箱容积(L)</td>
					</tr>
					<tr>
						<td>后备箱容积(L)</td>
					</tr>
					<tr>
						<td>风阻系数</td>
					</tr>
					<tr>
						<td>最小转弯半径(m)</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div>
			<div>
				<h3>发动机</h3>
			</div>
		</div>
		<div>
			<table cellpadding="0" cellspacing="1">
				<tbody>
					<tr>
						<td>发动机排量(mL)</td>
					</tr>
					<tr>
						<td>工作方式</td>
					</tr>
					<tr>
						<td>每缸气门数(个)</td>
					</tr>
					<tr>
						<td>气缸排列形式</td>
					</tr>
					<tr>
						<td>压缩比</td>
					</tr>
					<tr>
						<td>气门结构</td>
					</tr>
					<tr>
						<td>正时结构</td>
					</tr>
					<tr>
						<td>最大马力(Ps)</td>
					</tr>
					<tr>
						<td>最大功率(Kw)</td>
					</tr>
					<tr>
						<td>最大功率转速(rpm)</td>
					</tr>
					<tr>
						<td>最大扭矩(Nm)</td>
					</tr>
					<tr>
						<td>最大扭矩转速(rpm)</td>
					</tr>
					<tr>
						<td>发动机特有技术</td>
					</tr>
					<tr>
						<td>燃料形式</td>
					</tr>
					<tr>
						<td>燃油标号</td>
					</tr>
					<tr>
						<td>供油方式</td>
					</tr>
					<tr>
						<td>缸体材料</td>
					</tr>
					<tr>
						<td>环保标准</td>
					</tr>
					<tr>
						<td>弱混合动力</td>
					</tr>
					<tr>
						<td>强混合动力</td>
					</tr>
					<tr>
						<td>纯电动</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div>
			<div>
				<h3>底盘</h3>
			</div>
		</div>
		<div>
			<table cellpadding="0" cellspacing="1">
				<tbody>
					<tr>
						<td>变速器类型</td>
					</tr>
					<tr>
						<td>档位数(个)</td>
					</tr>
					<tr>
						<td>转向器型式</td>
					</tr>
					<tr>
						<td>驻车制动器</td>
					</tr>
					<tr>
						<td>前悬挂形式</td>
					</tr>
					<tr>
						<td>后悬挂形式</td>
					</tr>
					<tr>
						<td>前轮制动装置</td>
					</tr>
					<tr>
						<td>后轮制动装置</td>
					</tr>
					<tr>
						<td>前轮胎规格</td>
					</tr>
					<tr>
						<td>后轮胎规格</td>
					</tr>
					<tr>
						<td>备胎规格</td>
					</tr>
					<tr>
						<td>备胎轮毂材料</td>
					</tr>
					<tr>
						<td>差速锁</td>
					</tr>
					<tr>
						<td>可调悬挂</td>
					</tr>
					<tr>
						<td>空气悬挂</td>
					</tr>
					<tr>
						<td>底盘保护板</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div>
			<div>
				<h3>操控配置</h3>
			</div>
		</div>
		<div>
			<table cellpadding="0" cellspacing="1">
				<tbody>
					<tr>
						<td>ABS防抱死</td>
					</tr>
					<tr>
						<td>制动力分配(EBD/CBC等)</td>
					</tr>
					<tr>
						<td>刹车辅助(EBA/BAS/BA等)</td>
					</tr>
					<tr>
						<td>牵引力控制(ASR/TCS/TRC等)</td>
					</tr>
					<tr>
						<td>车身稳定控制(ESP/DSC/VSC等)</td>
					</tr>
					<tr>
						<td>官方0-100Km/h加速(s)</td>
					</tr>
					<tr>
						<td>官方100-0Km/h制动(m)</td>
					</tr>
					<tr>
						<td>自动驻车</td>
					</tr>
					<tr>
						<td>上坡辅助</td>
					</tr>
					<tr>
						<td>陡坡缓降</td>
					</tr>
					<tr>
						<td>可调悬挂</td>
					</tr>
					<tr>
						<td>空气悬挂</td>
					</tr>
					<tr>
						<td>主动转向系统</td>
					</tr>
					<tr>
						<td>主动防侧倾系统</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div>
			<div>
				<h3>外观</h3>
			</div>
		</div>
		<div>
			<table cellpadding="0" cellspacing="1">
				<tbody>
					<tr>
						<td>金属漆</td>
					</tr>
					<tr>
						<td>外观可选颜色</td>
					</tr>
					<tr>
						<td>内饰可选颜色</td>
					</tr>
					<tr>
						<td>隔热玻璃</td>
					</tr>
					<tr>
						<td>电动天窗</td>
					</tr>
					<tr>
						<td>全景天窗</td>
					</tr>
					<tr>
						<td>前电动车窗</td>
					</tr>
					<tr>
						<td>后电动车窗</td>
					</tr>
					<tr>
						<td>车窗防夹手</td>
					</tr>
					<tr>
						<td>驾驶席车窗功能</td>
					</tr>
					<tr>
						<td>副驾驶席车窗功能</td>
					</tr>
					<tr>
						<td>后排车窗功能</td>
					</tr>
					<tr>
						<td>卤素大灯</td>
					</tr>
					<tr>
						<td>氙气大灯</td>
					</tr>
					<tr>
						<td>日间行车灯</td>
					</tr>
					<tr>
						<td>大灯高度可调</td>
					</tr>
					<tr>
						<td>大灯清洗装置</td>
					</tr>
					<tr>
						<td>自动大灯</td>
					</tr>
					<tr>
						<td>转向辅助照明</td>
					</tr>
					<tr>
						<td>大灯随动转向</td>
					</tr>
					<tr>
						<td>前雾灯</td>
					</tr>
					<tr>
						<td>后雾灯</td>
					</tr>
					<tr>
						<td>LED尾灯</td>
					</tr>
					<tr>
						<td>轮毂材质</td>
					</tr>
					<tr>
						<td>轮毂尺寸</td>
					</tr>
					<tr>
						<td>外后视镜电动调节</td>
					</tr>
					<tr>
						<td>外后视镜加热</td>
					</tr>
					<tr>
						<td>外后视镜自动防眩目</td>
					</tr>
					<tr>
						<td>外后视镜电动折叠</td>
					</tr>
					<tr>
						<td>外后视镜带转向灯</td>
					</tr>
					<tr>
						<td>前感应雨刷</td>
					</tr>
					<tr>
						<td>前无骨雨刷</td>
					</tr>
					<tr>
						<td>后雨刷</td>
					</tr>
					<tr>
						<td>后感应雨刷</td>
					</tr>
					<tr>
						<td>天线</td>
					</tr>
					<tr>
						<td>电动吸合门</td>
					</tr>
					<tr>
						<td>后备箱</td>
					</tr>
					<tr>
						<td>后绕流板</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div>
			<div>
				<h3>内饰配置</h3>
			</div>
		</div>
		<div>
			<table cellpadding="0" cellspacing="1">
				<tbody>
					<tr>
						<td>无钥匙启动系统</td>
					</tr>
					<tr>
						<td>智能钥匙</td>
					</tr>
					<tr>
						<td>遥控钥匙</td>
					</tr>
					<tr>
						<td>多功能方向盘</td>
					</tr>
					<tr>
						<td>真皮方向盘</td>
					</tr>
					<tr>
						<td>方向盘上下调节</td>
					</tr>
					<tr>
						<td>方向盘前后调节</td>
					</tr>
					<tr>
						<td>方向盘换挡拨片</td>
					</tr>
					<tr>
						<td>方向盘加热功能</td>
					</tr>
					<tr>
						<td>自动防眩目内后视镜</td>
					</tr>
					<tr>
						<td>手动防眩目内后视镜</td>
					</tr>
					<tr>
						<td>一体式前排头枕</td>
					</tr>
					<tr>
						<td>分体式前排头枕</td>
					</tr>
					<tr>
						<td>后排头枕</td>
					</tr>
					<tr>
						<td>后排中间头枕</td>
					</tr>
					<tr>
						<td>定速巡航</td>
					</tr>
					<tr>
						<td>泊车辅助</td>
					</tr>
					<tr>
						<td>倒车视频影像</td>
					</tr>
					<tr>
						<td>夜视系统</td>
					</tr>
					<tr>
						<td>行车电脑</td>
					</tr>
					<tr>
						<td>HUD抬头数字显示</td>
					</tr>
					<tr>
						<td>后风挡遮阳帘</td>
					</tr>
					<tr>
						<td>后风挡加热功能</td>
					</tr>
					<tr>
						<td>后排侧遮阳帘</td>
					</tr>
					<tr>
						<td>遮阳板化妆镜</td>
					</tr>
					<tr>
						<td>遮阳板化妆镜照明</td>
					</tr>
					<tr>
						<td>后排化妆镜</td>
					</tr>
					<tr>
						<td>前烟灰盒</td>
					</tr>
					<tr>
						<td>前点烟器</td>
					</tr>
					<tr>
						<td>后烟灰盒</td>
					</tr>
					<tr>
						<td>后点烟器</td>
					</tr>
					<tr>
						<td>后排脚部支撑</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div>
			<div>
				<h3>座椅配置</h3>
			</div>
		</div>
		<div>
			<table cellpadding="0" cellspacing="1">
				<tbody>
					<tr>
						<td>织物座椅</td>
					</tr>
					<tr>
						<td>皮质座椅</td>
					</tr>
					<tr>
						<td>真皮座椅</td>
					</tr>
					<tr>
						<td>运动座椅</td>
					</tr>
					<tr>
						<td>驾驶座椅调节</td>
					</tr>
					<tr>
						<td>驾驶座椅记忆功能</td>
					</tr>
					<tr>
						<td>驾驶座椅腰部支撑调节</td>
					</tr>
					<tr>
						<td>驾驶座椅肩部支撑调节</td>
					</tr>
					<tr>
						<td>副驾驶座椅调节</td>
					</tr>
					<tr>
						<td>副驾驶座椅记忆功能</td>
					</tr>
					<tr>
						<td>副驾驶座椅腰部支撑调节</td>
					</tr>
					<tr>
						<td>副驾驶座椅肩部支撑调节</td>
					</tr>
					<tr>
						<td>前排座椅电动调节</td>
					</tr>
					<tr>
						<td>后排座椅电动调节</td>
					</tr>
					<tr>
						<td>第二排靠背角度调节</td>
					</tr>
					<tr>
						<td>第二排座椅移动</td>
					</tr>
					<tr>
						<td>驾驶座椅加热</td>
					</tr>
					<tr>
						<td>副驾驶座椅加热</td>
					</tr>
					<tr>
						<td>后排座椅加热</td>
					</tr>
					<tr>
						<td>驾驶座椅通风</td>
					</tr>
					<tr>
						<td>驾驶座椅按摩</td>
					</tr>
					<tr>
						<td>副驾驶座椅通风</td>
					</tr>
					<tr>
						<td>副驾驶座椅按摩</td>
					</tr>
					<tr>
						<td>后排座椅通风</td>
					</tr>
					<tr>
						<td>后排座椅按摩</td>
					</tr>
					<tr>
						<td>后排座椅整体放倒</td>
					</tr>
					<tr>
						<td>后排座椅比例放倒</td>
					</tr>
					<tr>
						<td>前座中央扶手</td>
					</tr>
					<tr>
						<td>后座中央扶手</td>
					</tr>
					<tr>
						<td>第三排座椅</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div>
			<div>
				<h3>空调/冰箱</h3>
			</div>
		</div>
		<div>
			<table cellpadding="0" cellspacing="1">
				<tbody>
					<tr>
						<td>手动空调</td>
					</tr>
					<tr>
						<td>自动空调</td>
					</tr>
					<tr>
						<td>温度分区控制</td>
					</tr>
					<tr>
						<td>后排独立空调</td>
					</tr>
					<tr>
						<td>后空调出风口</td>
					</tr>
					<tr>
						<td>空气净化系统</td>
					</tr>
					<tr>
						<td>花粉过滤</td>
					</tr>
					<tr>
						<td>车载冰箱</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div>
			<div>
				<h3>安全配置</h3>
			</div>
		</div>
		<div>
			<table cellpadding="0" cellspacing="1">
				<tbody>
					<tr>
						<td>驾驶座安全气囊</td>
					</tr>
					<tr>
						<td>副驾驶安全气囊</td>
					</tr>
					<tr>
						<td>副驾驶气囊开关</td>
					</tr>
					<tr>
						<td>前排侧气囊</td>
					</tr>
					<tr>
						<td>后排侧气囊</td>
					</tr>
					<tr>
						<td>前排头部气囊(气帘)</td>
					</tr>
					<tr>
						<td>后排头部气囊(气帘)</td>
					</tr>
					<tr>
						<td>膝部气囊</td>
					</tr>
					<tr>
						<td>驾驶位安全带未系提示</td>
					</tr>
					<tr>
						<td>副驾驶位安全带未系提示</td>
					</tr>
					<tr>
						<td>燃爆式安全带</td>
					</tr>
					<tr>
						<td>后排三点式安全带</td>
					</tr>
					<tr>
						<td>ISOFIX儿童座椅固定装置</td>
					</tr>
					<tr>
						<td>前排主动头枕</td>
					</tr>
					<tr>
						<td>发动机电子防盗</td>
					</tr>
					<tr>
						<td>车内中控锁</td>
					</tr>
					<tr>
						<td>后备箱逃逸功能</td>
					</tr>
					<tr>
						<td>车轮螺栓锁</td>
					</tr>
					<tr>
						<td>胎压监测装置</td>
					</tr>
					<tr>
						<td>零胎压继续行驶</td>
					</tr>
					<tr>
						<td>第三制动灯</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div>
			<div>
				<h3>多媒体配置</h3>
			</div>
		</div>
		<div>
			<table cellpadding="0" cellspacing="1">
				<tbody>
					<tr>
						<td>GPS导航系统</td>
					</tr>
					<tr>
						<td>人机交互系统</td>
					</tr>
					<tr>
						<td>内置硬盘</td>
					</tr>
					<tr>
						<td>蓝牙/车载电话</td>
					</tr>
					<tr>
						<td>车载电视</td>
					</tr>
					<tr>
						<td>后排液晶屏</td>
					</tr>
					<tr>
						<td>外接AUX 接口</td>
					</tr>
					<tr>
						<td>外接USB 接口</td>
					</tr>
					<tr>
						<td>外接iPod 接口</td>
					</tr>
					<tr>
						<td>单碟CD</td>
					</tr>
					<tr>
						<td>虚拟多碟CD</td>
					</tr>
					<tr>
						<td>多碟CD</td>
					</tr>
					<tr>
						<td>CD支持MP3/WMA</td>
					</tr>
					<tr>
						<td>DVD系统</td>
					</tr>
					<tr>
						<td>高保真扬声系统</td>
					</tr>
					<tr>
						<td>喇叭扬声器个数</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div>
			<div>
				<h3>高科技配置</h3>
			</div>
		</div>
		<div>
			<table cellpadding="0" cellspacing="1">
				<tbody>
					<tr>
						<td>自动泊车入位</td>
					</tr>
					<tr>
						<td>并线辅助</td>
					</tr>
					<tr>
						<td>主动刹车/主动安全系统</td>
					</tr>
					<tr>
						<td>整体主动转向系统</td>
					</tr>
					<tr>
						<td>夜视系统</td>
					</tr>
					<tr>
						<td>中控液晶屏分屏显示</td>
					</tr>
					<tr>
						<td>自适应巡航</td>
					</tr>
					<tr>
						<td>侧视摄像头</td>
					</tr>
					<tr>
						<td>G-Book</td>
					</tr>
					<tr>
						<td>On Start</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>

