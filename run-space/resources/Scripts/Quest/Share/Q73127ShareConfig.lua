-- 任务配置数据开始-----------------------------

main_id = 73127sub_ids = {	7312701,	7312702,	7312706,	7312703,	7312704,	7312705,}-- 任务配置数据结束----------------------------------- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>-- 父任务执行项数据开始-----------------------------finish_action = {	CLIENT = { },	SERVER = { },}fail_action = {	CLIENT = { },	SERVER = { },}cancel_action = {	CLIENT = { },	SERVER = { },}-- 父任务执行项数据结束------------------------------- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>-- Actor模块数据开始---------------------------------- 空-- Actor模块数据结束---------------------------------- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>-- 文本模块数据开始----------------------------------- 空-- 文本模块数据结束----------------------------------- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>-- 路点模块数据开始----------------------------------- 空-- 路点模块数据结束----------------------------------- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>-- 断线重连生成内容 开始------------------------------ 和questdata配的存档点对应rewind_data = {	["7312702"] = { },	["7312703"] = { },	["7312704"] = 	{		npcs = 		{			{				id = 20693,				alias = "Npc20693",				script = "Actor/Npc/TempNPC",				pos = "Q7312703_N20693",				scene_id = 3,				room_id = 0,				data_index = 1,				bornShoesOffset = 1,			},		},	},	["7312705"] = 	{		npcs = 		{			{				id = 20693,				alias = "Npc20693",				script = "Actor/Npc/TempNPC",				pos = "Q7312703_N20693",				scene_id = 3,				room_id = 0,				data_index = 1,				bornShoesOffset = 1,			},		},	},	["7312706"] = { },}-- 断线重连生成内容 结束------------------------------ >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>-- 校验数据 开始------------------------------------ 和任务lua中生成NPC/Monster/Gadget/Item等对应quest_data = {	["7312701"] = { },	["7312702"] = 	{		npcs = 		{			{				id = 20693,				alias = "Npc20693",				script = "Actor/Npc/TempNPC",				pos = "Q7312703_N20693",				scene_id = 3,				room_id = 0,				data_index = 1,				bornShoesOffset = 1,			},		},	},	["7312703"] = 	{		npcs = 		{			{				id = 20693,				alias = "Npc20693",				script = "Actor/Npc/TempNPC",				pos = "Q7312703_N20693",				scene_id = 3,				room_id = 0,				data_index = 1,				bornShoesOffset = 1,			},		},	},	["7312704"] = { },	["7312705"] = { },	["7312706"] = 	{		npcs = 		{			{				id = 20693,				alias = "Npc20693",				script = "Actor/Npc/TempNPC",				pos = "Q7312703_N20693",				scene_id = 3,				room_id = 0,				data_index = 1,				bornShoesOffset = 1,			},		},	},}-- 校验数据 结束------------------------------------ >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>