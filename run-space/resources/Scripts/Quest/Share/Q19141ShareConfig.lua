-- 任务配置数据开始-----------------------------

main_id = 19141sub_ids = {	1914101,	1914102,}-- 任务配置数据结束----------------------------------- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>-- 父任务执行项数据开始-----------------------------finish_action = {	CLIENT = { },	SERVER = { },}fail_action = {	CLIENT = { },	SERVER = { },}cancel_action = {	CLIENT = { },	SERVER = 	{		QUEST_EXEC_UNREGISTER_DYNAMIC_GROUP = 		{			{ "133221078", "", },		},	},}-- 父任务执行项数据结束------------------------------- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>-- Actor模块数据开始---------------------------------- 空-- Actor模块数据结束---------------------------------- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>-- 文本模块数据开始----------------------------------- 空-- 文本模块数据结束----------------------------------- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>-- 路点模块数据开始----------------------------------- 空-- 路点模块数据结束----------------------------------- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>-- 断线重连生成内容 开始------------------------------ 和questdata配的存档点对应rewind_data = {	["1914101"] = { },	["1914102"] = { },}-- 断线重连生成内容 结束------------------------------ >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>-- 校验数据 开始------------------------------------ 和任务lua中生成NPC/Monster/Gadget/Item等对应quest_data = {	["1914101"] = 	{		npcs = 		{			{				id = 510,				alias = "Coop_Shinobu",				script = "Actor/Npc/TempNPC",				pos = "Q1914101_C1914101_N510",				scene_id = 3,				room_id = 0,				data_index = 1,			},			{				id = 12276,				alias = "Npc12276",				script = "Actor/Npc/TempNPC",				pos = "Q1914101_C1914101_N12276",				scene_id = 3,				room_id = 0,				data_index = 2,			},			{				id = 12277,				alias = "Npc12277",				script = "Actor/Npc/TempNPC",				pos = "Q1914101_C1914101_N12277",				scene_id = 3,				room_id = 0,				data_index = 3,			},			{				id = 12278,				alias = "Npc12278",				script = "Actor/Npc/TempNPC",				pos = "Q1914101_C1914101_N12278",				scene_id = 3,				room_id = 0,				data_index = 4,			},			{				id = 3020,				alias = "Npc3020",				script = "Actor/Npc/NpcFSMBehaviour",				pos = "Q1914101_C1914101_N3020",				scene_id = 3,				room_id = 0,				data_index = 5,			},			{				id = 1049,				alias = "Npc1049",				script = "Actor/Npc/TempNPC",				pos = "Q1914101_C1914101_N510",				scene_id = 3,				room_id = 0,				data_index = 6,			},		},	},	["1914102"] = 	{		npcs = 		{			{				id = 510,				alias = "Coop_Shinobu",				script = "Actor/Npc/TempNPC",				pos = "Q1914102_C1914102_N510",				scene_id = 3,				room_id = 0,				data_index = 1,			},			{				id = 12276,				alias = "Npc12276",				script = "Actor/Npc/TempNPC",				pos = "Q1914102_C1914102_N12276",				scene_id = 3,				room_id = 0,				data_index = 2,			},			{				id = 12277,				alias = "Npc12277",				script = "Actor/Npc/TempNPC",				pos = "Q1914102_C1914102_N12277",				scene_id = 3,				room_id = 0,				data_index = 3,			},			{				id = 12278,				alias = "Npc12278",				script = "Actor/Npc/TempNPC",				pos = "Q1914102_C1914102_N12278",				scene_id = 3,				room_id = 0,				data_index = 4,			},			{				id = 3020,				alias = "Npc3020",				script = "Actor/Npc/NpcFSMBehaviour",				pos = "Q1914101_C1914101_N3020",				scene_id = 3,				room_id = 0,				data_index = 5,			},			{				id = 1049,				alias = "Npc1049",				script = "Actor/Npc/TempNPC",				pos = "Q1914102_C1914102_N510",				scene_id = 3,				room_id = 0,				data_index = 6,			},		},	},}-- 校验数据 结束------------------------------------ >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>