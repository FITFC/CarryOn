package tschipp.carryon.common.scripting;

import net.minecraft.nbt.CompoundNBT;

public class CarryOnOverride
{
	// BLOCKS
	private CompoundNBT typeBlockTag;
	private String typeNameBlock;
	private String typeMaterial;
	private String typeHardness;
	private String typeResistance;

	// ENTITIES
	private CompoundNBT typeEntityTag;
	private String typeNameEntity;
	private String typeHeight;
	private String typeWidth;
	private String typeHealth;

	// CONDITIONS
	private String conditionGamestage;
	private String conditionAchievement;
	private String conditionXp;
	private String conditionGamemode;
	private String conditionScoreboard;
	private String conditionPosition;
	private String conditionEffects;

	// RENDER
	private String renderNameBlock;
	private String renderNameEntity;
	private CompoundNBT renderNBT;
	private String renderTranslation;
	private String renderRotation;
	private String renderscaled;
	private String renderRotationLeftArm;
	private String renderRotationRightArm;
	private boolean renderLeftArm = true;
	private boolean renderRightArm = true;
	
	//EFFECTS
	private String commandInit;
	private String commandLoop;
	private String commandPlace;

	private boolean isBlock;
	private boolean isEntity;
	private final String path;
	

	public CarryOnOverride(String path)
	{
		this.path = path;
	}
	
	
	
	public String getCommandInit()
	{
		return commandInit;
	}

	public void setCommandInit(String commandInit)
	{
		this.commandInit = commandInit;
	}

	public String getCommandLoop()
	{
		return commandLoop;
	}

	public void setCommandLoop(String commandLoop)
	{
		this.commandLoop = commandLoop;
	}

	public String getConditionEffects()
	{
		return conditionEffects;
	}

	public void setConditionEffects(String conditionEffects)
	{
		this.conditionEffects = conditionEffects;
	}

	public String getRenderRotationLeftArm()
	{
		return renderRotationLeftArm;
	}

	public void setRenderRotationLeftArm(String renderRotationLeftArm)
	{
		this.renderRotationLeftArm = renderRotationLeftArm;
	}

	public String getRenderRotationRightArm()
	{
		return renderRotationRightArm;
	}

	public void setRenderRotationRightArm(String renderRotationRightArm)
	{
		this.renderRotationRightArm = renderRotationRightArm;
	}

	public boolean isRenderLeftArm()
	{
		return renderLeftArm;
	}

	public void setRenderLeftArm(boolean renderLeftArm)
	{
		this.renderLeftArm = renderLeftArm;
	}

	public boolean isRenderRightArm()
	{
		return renderRightArm;
	}

	public void setRenderRightArm(boolean renderRightArm)
	{
		this.renderRightArm = renderRightArm;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((path == null) ? 0 : path.hashCode());
		return result;
	}
	
	@Override
	public String toString()
	{
		return "Code: " + this.hashCode();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarryOnOverride other = (CarryOnOverride) obj;
		if (commandInit == null)
		{
			if (other.commandInit != null)
				return false;
		}
		else if (!commandInit.equals(other.commandInit))
			return false;
		if (commandLoop == null)
		{
			if (other.commandLoop != null)
				return false;
		}
		else if (!commandLoop.equals(other.commandLoop))
			return false;
		if (commandPlace == null)
		{
			if (other.commandPlace != null)
				return false;
		}
		else if (!commandPlace.equals(other.commandPlace))
			return false;
		if (conditionAchievement == null)
		{
			if (other.conditionAchievement != null)
				return false;
		}
		else if (!conditionAchievement.equals(other.conditionAchievement))
			return false;
		if (conditionEffects == null)
		{
			if (other.conditionEffects != null)
				return false;
		}
		else if (!conditionEffects.equals(other.conditionEffects))
			return false;
		if (conditionGamemode == null)
		{
			if (other.conditionGamemode != null)
				return false;
		}
		else if (!conditionGamemode.equals(other.conditionGamemode))
			return false;
		if (conditionGamestage == null)
		{
			if (other.conditionGamestage != null)
				return false;
		}
		else if (!conditionGamestage.equals(other.conditionGamestage))
			return false;
		if (conditionPosition == null)
		{
			if (other.conditionPosition != null)
				return false;
		}
		else if (!conditionPosition.equals(other.conditionPosition))
			return false;
		if (conditionScoreboard == null)
		{
			if (other.conditionScoreboard != null)
				return false;
		}
		else if (!conditionScoreboard.equals(other.conditionScoreboard))
			return false;
		if (conditionXp == null)
		{
			if (other.conditionXp != null)
				return false;
		}
		else if (!conditionXp.equals(other.conditionXp))
			return false;
		if (isBlock != other.isBlock)
			return false;
		if (isEntity != other.isEntity)
			return false;
		if (path == null)
		{
			if (other.path != null)
				return false;
		}
		else if (!path.equals(other.path))
			return false;
		if (renderLeftArm != other.renderLeftArm)
			return false;
		if (renderNBT == null)
		{
			if (other.renderNBT != null)
				return false;
		}
		else if (!renderNBT.equals(other.renderNBT))
			return false;
		if (renderNameBlock == null)
		{
			if (other.renderNameBlock != null)
				return false;
		}
		else if (!renderNameBlock.equals(other.renderNameBlock))
			return false;
		if (renderNameEntity == null)
		{
			if (other.renderNameEntity != null)
				return false;
		}
		else if (!renderNameEntity.equals(other.renderNameEntity))
			return false;
		if (renderRightArm != other.renderRightArm)
			return false;
		if (renderRotation == null)
		{
			if (other.renderRotation != null)
				return false;
		}
		else if (!renderRotation.equals(other.renderRotation))
			return false;
		if (renderRotationLeftArm == null)
		{
			if (other.renderRotationLeftArm != null)
				return false;
		}
		else if (!renderRotationLeftArm.equals(other.renderRotationLeftArm))
			return false;
		if (renderRotationRightArm == null)
		{
			if (other.renderRotationRightArm != null)
				return false;
		}
		else if (!renderRotationRightArm.equals(other.renderRotationRightArm))
			return false;
		if (renderscaled == null)
		{
			if (other.renderscaled != null)
				return false;
		}
		else if (!renderscaled.equals(other.renderscaled))
			return false;
		if (renderTranslation == null)
		{
			if (other.renderTranslation != null)
				return false;
		}
		else if (!renderTranslation.equals(other.renderTranslation))
			return false;
		if (typeBlockTag == null)
		{
			if (other.typeBlockTag != null)
				return false;
		}
		else if (!typeBlockTag.equals(other.typeBlockTag))
			return false;
		if (typeEntityTag == null)
		{
			if (other.typeEntityTag != null)
				return false;
		}
		else if (!typeEntityTag.equals(other.typeEntityTag))
			return false;
		if (typeHardness == null)
		{
			if (other.typeHardness != null)
				return false;
		}
		else if (!typeHardness.equals(other.typeHardness))
			return false;
		if (typeHealth == null)
		{
			if (other.typeHealth != null)
				return false;
		}
		else if (!typeHealth.equals(other.typeHealth))
			return false;
		if (typeHeight == null)
		{
			if (other.typeHeight != null)
				return false;
		}
		else if (!typeHeight.equals(other.typeHeight))
			return false;
		if (typeMaterial == null)
		{
			if (other.typeMaterial != null)
				return false;
		}
		else if (!typeMaterial.equals(other.typeMaterial))
			return false;
		if (typeNameBlock == null)
		{
			if (other.typeNameBlock != null)
				return false;
		}
		else if (!typeNameBlock.equals(other.typeNameBlock))
			return false;
		if (typeNameEntity == null)
		{
			if (other.typeNameEntity != null)
				return false;
		}
		else if (!typeNameEntity.equals(other.typeNameEntity))
			return false;
		if (typeResistance == null)
		{
			if (other.typeResistance != null)
				return false;
		}
		else if (!typeResistance.equals(other.typeResistance))
			return false;
		if (typeWidth == null)
		{
			if (other.typeWidth != null)
				return false;
		}
		else if (!typeWidth.equals(other.typeWidth))
			return false;
		return true;
	}



	public boolean isBlock()
	{
		return isBlock;
	}

	public void setBlock(boolean isBlock)
	{
		this.isBlock = isBlock;
	}

	public boolean isEntity()
	{
		return isEntity;
	}

	public void setEntity(boolean isEntity)
	{
		this.isEntity = isEntity;
	}

	public CompoundNBT getTypeBlockTag()
	{
		return typeBlockTag;
	}

	public String getTypeNameBlock()
	{
		return typeNameBlock;
	}

	public String getTypeMaterial()
	{
		return typeMaterial;
	}

	public String getTypeHardness()
	{
		return typeHardness;
	}

	public String getTypeResistance()
	{
		return typeResistance;
	}

	public CompoundNBT getTypeEntityTag()
	{
		return typeEntityTag;
	}

	public String getTypeNameEntity()
	{
		return typeNameEntity;
	}

	public String getTypeHeight()
	{
		return typeHeight;
	}

	public String getTypeWidth()
	{
		return typeWidth;
	}

	public String getTypeHealth()
	{
		return typeHealth;
	}

	public String getConditionGamestage()
	{
		return conditionGamestage;
	}

	public String getConditionAchievement()
	{
		return conditionAchievement;
	}

	public String getConditionXp()
	{
		return conditionXp;
	}

	public String getConditionGamemode()
	{
		return conditionGamemode;
	}

	public String getConditionScoreboard()
	{
		return conditionScoreboard;
	}

	public String getConditionPosition()
	{
		return conditionPosition;
	}

	public String getRenderNameBlock()
	{
		return renderNameBlock;
	}

	public String getRenderNameEntity()
	{
		return renderNameEntity;
	}

	public CompoundNBT getRenderNBT()
	{
		return renderNBT;
	}

	public String getRenderTranslation()
	{
		return renderTranslation;
	}

	public String getRenderRotation()
	{
		return renderRotation;
	}

	public String getRenderScaled()
	{
		return renderscaled;
	}

	public void setTypeBlockTag(CompoundNBT typeBlockTag)
	{
		this.typeBlockTag = typeBlockTag;
	}


	public void setTypeNameBlock(String typeNameBlock)
	{
		this.typeNameBlock = typeNameBlock;
	}

	public void setTypeMaterial(String typeMaterial)
	{
		this.typeMaterial = typeMaterial;
	}

	public void setTypeHardness(String typeHardness)
	{
		this.typeHardness = typeHardness;
	}

	public void setTypeResistance(String typeResistance)
	{
		this.typeResistance = typeResistance;
	}

	public void setTypeEntityTag(CompoundNBT typeEntityTag)
	{
		this.typeEntityTag = typeEntityTag;
	}

	public void setTypeNameEntity(String typeNameEntity)
	{
		this.typeNameEntity = typeNameEntity;
	}

	public void setTypeHeight(String typeHeight)
	{
		this.typeHeight = typeHeight;
	}

	public void setTypeWidth(String typeWidth)
	{
		this.typeWidth = typeWidth;
	}

	public void setTypeHealth(String typeHealth)
	{
		this.typeHealth = typeHealth;
	}

	public void setConditionGamestage(String conditionGamestage)
	{
		this.conditionGamestage = conditionGamestage;
	}

	public void setConditionAchievement(String conditionAchievement)
	{
		this.conditionAchievement = conditionAchievement;
	}

	public void setConditionXp(String conditionXp)
	{
		this.conditionXp = conditionXp;
	}

	public void setConditionGamemode(String conditionGamemode)
	{
		this.conditionGamemode = conditionGamemode;
	}

	public void setConditionScoreboard(String conditionScoreboard)
	{
		this.conditionScoreboard = conditionScoreboard;
	}

	public void setConditionPosition(String conditionPosition)
	{
		this.conditionPosition = conditionPosition;
	}

	public void setRenderNameBlock(String renderNameBlock)
	{
		this.renderNameBlock = renderNameBlock;
	}

	public void setRenderNameEntity(String renderNameEntity)
	{
		this.renderNameEntity = renderNameEntity;
	}

	public void setRenderNBT(CompoundNBT renderNBT)
	{
		this.renderNBT = renderNBT;
	}

	public void setRenderTranslation(String renderTranslation)
	{
		this.renderTranslation = renderTranslation;
	}

	public void setRenderRotation(String renderRotation)
	{
		this.renderRotation = renderRotation;
	}

	public void setRenderscaled(String renderscaled)
	{
		this.renderscaled = renderscaled;
	}



	public String getCommandPlace()
	{
		return commandPlace;
	}

	public void setCommandPlace(String commandPlace)
	{
		this.commandPlace = commandPlace;
	}
	
	

}
