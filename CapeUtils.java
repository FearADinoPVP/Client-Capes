public class CapeUtils
{

public static void downloadCape(final AbstractClientPlayer player)
  { 

	String uname = player.getNameClear();

      if (uname != null && !uname.isEmpty())
      {
        if(<Your Cape Controller Class Name>.<Your Boolean Name> == true) {
      	  final ResourceLocation capeTrue = new ResourceLocation("<your assets folder>/<CapeImageName>.png");
      	  if(capeTrue !=null) {
      		  player.setLocationOfCape(capeTrue);
      	  }
        }
       }
        else {
      	  String ofCapeUrl = "http://s.optifine.net/capes/" + username + ".png";
            String mptHash = FilenameUtils.getBaseName(ofCapeUrl);
            final ResourceLocation resourcelocator = new ResourceLocation("capeof/" + mptHash);
            TextureManager textureManager = Minecraft.getMinecraft().getTextureManager();
            ITextureObject tex = textureManager.getTexture(rl);

            if (tex != null && tex instanceof ThreadDownloadImageData)
            {
                ThreadDownloadImageData thePlayer = (ThreadDownloadImageData)tex;

                if (thePlayer.imageFound != null)
                {
                    if (thePlayer.imageFound.booleanValue())
                    {
                        player.setLocationOfCape(resourcelocator);
                    }

                    return;
                }
            }
