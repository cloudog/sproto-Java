package cloudog.sprotojump;

public class Main {
	public static void main(String[] args)
	{
		System.out.println(MessageType.binary.ordinal());
		
		int argLength=args.length;
		StringBuilder commandLine=new StringBuilder();
		System.out.println("Start to generate......");
		for(int i=0;i<argLength;i++)
		{
			commandLine.append(args[i]);
		}
		if(CommandUtil.checkArgs(commandLine.toString()))
		{
			if(SchemaUtil.check())
			{
				if(CodeGenerator.begin())
				{
					System.out.println("Success!");
				}
				else
				{
					System.out.println("Code generate error:"+CodeGenerator.errorStackStr);
				}
			}
			else
			{
				System.out.println("Schema error:"+SchemaUtil.errorStackStr);
			}
		}
		else
		{
			System.out.println("Arguments error:"+CommandUtil.errorStackStr);
		}
		System.out.println("End......");
	}
}
