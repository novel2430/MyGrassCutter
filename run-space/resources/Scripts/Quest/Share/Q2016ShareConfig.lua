-- 任务配置数据开始-----------------------------

main_id = 2016

sub_ids = 
{
	201601,
	201606,
	201608,
	201602,
	201607,
	201603,
	201604,
	201605,
	201609,
}
-- 任务配置数据结束---------------------------------
-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

-- 父任务执行项数据开始-----------------------------
finish_action = 
{
	CLIENT = { },
	SERVER = { },
}

fail_action = 
{
	CLIENT = { },
	SERVER = { },
}

cancel_action = 
{
	CLIENT = { },
	SERVER = { },
}
-- 父任务执行项数据结束-----------------------------
-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
-- Actor模块数据开始--------------------------------
-- 空
-- Actor模块数据结束--------------------------------
-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
-- 文本模块数据开始---------------------------------
-- 空
-- 文本模块数据结束---------------------------------
-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
-- 路点模块数据开始---------------------------------
-- 空
-- 路点模块数据结束---------------------------------
-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


-- 断线重连生成内容 开始----------------------------
-- 和questdata配的存档点对应
rewind_data = 
{
	["201601"] = 
	{
		npcs = 
		{
			{
				id = 1034,
				alias = "Npc1034",
				script = "Actor/Npc/TempNPC",
				pos = "Q201601Yaeko",
				scene_id = 3,
				room_id = 0,
				data_index = 1,
			},
		},
	},
	["201602"] = 
	{
		npcs = 
		{
			{
				id = 1034,
				alias = "Npc1034",
				script = "Actor/Npc/TempNPC",
				pos = "Q201604Yaeko",
				scene_id = 3,
				room_id = 0,
				data_index = 1,
			},
		},
	},
	["201603"] = { },
	["201604"] = { },
	["201605"] = 
	{
		npcs = 
		{
			{
				id = 1034,
				alias = "Npc1034",
				script = "Actor/Npc/TempNPC",
				pos = "Q201605Yaeko",
				scene_id = 3,
				room_id = 0,
				data_index = 1,
			},
		},
	},
	["201606"] = { },
	["201607"] = 
	{ 
		npcs = 
		{
			{
				id = 1034,
				alias = "Npc1034",
				script = "Actor/Npc/TempNPC",
				pos = "Q201604Yaeko",
				scene_id = 3,
				room_id = 0,
				data_index = 1,
			},
		},
	},
}
-- 断线重连生成内容 结束----------------------------
-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

-- 校验数据 开始----------------------------------
-- 和任务lua中生成NPC/Monster/Gadget/Item等对应
quest_data = 
{
	["201601"] = 
	{
		npcs = 
		{
			{
				id = 1034,
				alias = "Npc1034",
				script = "Actor/Npc/TempNPC",
				pos = "Q201601Yaeko",
				scene_id = 3,
				room_id = 0,
				data_index = 1,
			},
		},
		transmit_points = 
		{
			{
				point_id = 1,
				scene_id = 3,
				pos = "Q201601Trans",
			},
		},
	},
	["201602"] = { },
	["201603"] = 
	{
		npcs = 
		{
			{
				id = 1034,
				alias = "Npc1034",
				script = "Actor/Npc/TempNPC",
				pos = "Q201604Yaeko",
				scene_id = 3,
				room_id = 0,
				data_index = 1,
			},
		},
	},
	["201604"] = 
	{
		npcs = 
		{
			{
				id = 1034,
				alias = "Npc1034",
				script = "Actor/Npc/TempNPC",
				pos = "Q201604Yaeko",
				scene_id = 3,
				room_id = 0,
				data_index = 1,
			},
		},
	},
	["201605"] = { },
	["201606"] = 
	{
		npcs = 
		{
			{
				id = 1034,
				alias = "Npc1034",
				script = "Actor/Npc/TempNPC",
				pos = "Q201601Yaeko",
				scene_id = 3,
				room_id = 0,
				data_index = 1,
			},
		},
	},
	["201607"] = 
	{
		npcs = 
		{
			{
				id = 1034,
				alias = "Npc1034",
				script = "Actor/Npc/TempNPC",
				pos = "Q201604Yaeko",
				scene_id = 3,
				room_id = 0,
				data_index = 1,
			},
		},
	},
	["201608"] = 
	{
		npcs = 
		{
			{
				id = 1034,
				alias = "Npc1034",
				script = "Actor/Npc/TempNPC",
				pos = "Q201604Yaeko",
				scene_id = 3,
				room_id = 0,
				data_index = 1,
			},
		},
	},
	["201609"] = 
	{
		npcs = 
		{
			{
				id = 1034,
				alias = "Npc1034",
				script = "Actor/Npc/TempNPC",
				pos = "Q201605Yaeko",
				scene_id = 3,
				room_id = 0,
				data_index = 1,
			},
		},
	},
}
-- 校验数据 结束----------------------------------
-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
