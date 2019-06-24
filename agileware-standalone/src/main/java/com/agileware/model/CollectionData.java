package com.agileware.model;

import java.util.Arrays;

import javax.persistence.Transient;

import org.json.simple.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "collection_data")
@CompoundIndexes({
	
	@CompoundIndex(name ="formlabelIndex", def = "{'viewData.formData.label' :1 ,'viewData.formData.value' :1 }")
	
})

public class CollectionData {

	@Id
	private String id;
	private String tenantId;
	private String customerId;
	private String roleName;
	private String tenantName;
	@Indexed (name ="collectionDefinitionIdIndex")
	private String collectionDefinitionId;
	private JSONObject[] viewData;
	private JSONObject customLayout;
	@Indexed (name ="subjectDataIdIndex")
	private String subjectDataId;
	private boolean archive = false;

	private String dataRevisionId;
	@Indexed (name="lastModifiedDate",direction = IndexDirection.DESCENDING)
	private Long lastModifiedDate;
	private String lastModifiedBy;
	private String lastModifiedName;
	private String version;
	
	private Long lastLockedDate;
	private String lockedBy;
	private boolean lockedPermission;

	private String status;

	private boolean versionStatus;
	
	private String collectionDefinitionVersion;
	
	@Transient
	private String actionType;


	public CollectionData() {
		super();
	}

	public CollectionData(CollectionData collectionData) {
		super();
		this.id = collectionData.getId();
		this.collectionDefinitionId = collectionData.getCollectionDefinitionId();
		this.customerId =collectionData.getCustomerId();
		this.tenantId =collectionData.getTenantId();
		this.roleName =collectionData.getRoleName();
		this.tenantName =collectionData.getTenantName();
		this.viewData = collectionData.getViewData();
		this.subjectDataId = collectionData.getSubjectDataId();
		this.archive = collectionData.isArchive();
		this.dataRevisionId = collectionData.getDataRevisionId();
		this.lastModifiedDate = collectionData.getLastModifiedDate();
		this.lastModifiedBy = collectionData.getLastModifiedBy();
		this.lastModifiedName = collectionData.getLastModifiedName();
		this.version = collectionData.getVersion();
		this.status = collectionData.getStatus();
		this.lastLockedDate = collectionData.getLastLockedDate();
		this.lockedBy = collectionData.getLockedBy();
		this.lockedPermission = collectionData.isLockedPermission();
		this.versionStatus = collectionData.isVersionStatus();
		this.customLayout = collectionData.getCustomLayout();
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCollectionDefinitionId() {
		return collectionDefinitionId;
	}

	public void setCollectionDefinitionId(String collectionDefinitionId) {
		this.collectionDefinitionId = collectionDefinitionId;
	}

	public JSONObject[] getViewData() {
		return viewData;
	}

	public void setViewData(JSONObject[] viewData) {
		this.viewData = viewData;
	}

	public String getSubjectDataId() {
		return subjectDataId;
	}

	public void setSubjectDataId(String subjectDataId) {
		this.subjectDataId = subjectDataId;
	}

	public boolean isArchive() {
		return archive;
	}

	public void setArchive(boolean archive) {
		this.archive = archive;
	}

	public String getDataRevisionId() {
		return dataRevisionId;
	}

	public void setDataRevisionId(String dataRevisionId) {
		this.dataRevisionId = dataRevisionId;
	}

	public Long getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Long lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLockedBy() {
		return lockedBy;
	}

	public void setLockedBy(String lockedBy) {
		this.lockedBy = lockedBy;
	}

	public boolean isLockedPermission() {
		return lockedPermission;
	}

	public void setLockedPermission(boolean lockedPermission) {
		this.lockedPermission = lockedPermission;
	}

	public boolean isVersionStatus() {
		return versionStatus;
	}

	public void setVersionStatus(boolean versionStatus) {
		this.versionStatus = versionStatus;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}
	

	
	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}


	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public Long getLastLockedDate() {
		return lastModifiedDate;
	}

	public void setLastLockedDate(Long lastLockedDate) {
		this.lastLockedDate = lastLockedDate;
	}
	
	public String getLastModifiedName() {
		return lastModifiedName;
	}

	public void setLastModifiedName(String lastModifiedName) {
		this.lastModifiedName = lastModifiedName;
	}
	
	
	public JSONObject getCustomLayout() {
		return customLayout;
	}

	public void setCustomLayout(JSONObject customLayout) {
		this.customLayout = customLayout;
	}
 
	public String getCollectionDefinitionVersion() {
		return collectionDefinitionVersion;
	}

	public void setCollectionDefinitionVersion(String collectionDefinitionVersion) {
		this.collectionDefinitionVersion = collectionDefinitionVersion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (archive ? 1231 : 1237);
		result = prime * result + ((collectionDefinitionId == null) ? 0 : collectionDefinitionId.hashCode());
		result = prime * result + ((dataRevisionId == null) ? 0 : dataRevisionId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastModifiedBy == null) ? 0 : lastModifiedBy.hashCode());
		result = prime * result + ((lastModifiedName == null) ? 0 : lastModifiedName.hashCode());
		result = prime * result + ((lastModifiedDate == null) ? 0 : lastModifiedDate.hashCode());
		result = prime * result + ((subjectDataId == null) ? 0 : subjectDataId.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + (lockedPermission ? 1231 : 1237);
		result = prime * result + ((lockedBy == null) ? 0 : lockedBy.hashCode());
		result = prime * result + ((lastLockedDate == null) ? 0 : lastLockedDate.hashCode());
		result = prime * result + (versionStatus ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(viewData);
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
		result = prime * result + ((tenantId == null) ? 0 : tenantId.hashCode());
		result = prime * result + ((tenantName == null) ? 0 : tenantName.hashCode());
		result = prime * result + ((collectionDefinitionVersion == null) ? 0 : collectionDefinitionVersion.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CollectionData other = (CollectionData) obj;
		if (archive != other.archive)
			return false;
		if (lockedPermission != other.lockedPermission)
			return false;
		if (versionStatus != other.versionStatus)
			return false;
		if (collectionDefinitionId == null) {
			if (other.collectionDefinitionId != null)
				return false;
		} else if (!collectionDefinitionId.equals(other.collectionDefinitionId))
			return false;
		if (dataRevisionId == null) {
			if (other.dataRevisionId != null)
				return false;
		} else if (!dataRevisionId.equals(other.dataRevisionId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastModifiedBy == null) {
			if (other.lastModifiedBy != null)
				return false;
		} else if (!lastModifiedBy.equals(other.lastModifiedBy))
			return false;
		if (lastModifiedDate == null) {
			if (other.lastModifiedDate != null)
				return false;
		} else if (!lastModifiedDate.equals(other.lastModifiedDate))
			return false;
		if (subjectDataId == null) {
			if (other.subjectDataId != null)
				return false;
		} else if (!subjectDataId.equals(other.subjectDataId))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		if (lockedBy == null) {
			if (other.lockedBy != null)
				return false;
		} else if (!lockedBy.equals(other.lockedBy))
			return false;
		if (!Arrays.equals(viewData, other.viewData))
			return false;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (tenantId == null) {
			if (other.tenantId != null)
				return false;
		} else if (!tenantId.equals(other.tenantId))
			return false;
		if (roleName == null) {
			if (other.roleName != null)
				return false;
		} else if (!roleName.equals(other.roleName))
			return false;
		if (tenantName == null) {
			if (other.tenantName != null)
				return false;
		} else if (!tenantName.equals(other.tenantName))
			return false;
		if (lastLockedDate == null) {
			if (other.lastLockedDate != null)
				return false;
		} else if (!lastLockedDate.equals(other.lastLockedDate))
			return false;
		if (lastModifiedName == null) {
			if (other.lastModifiedName != null)
				return false;
		} else if (!lastModifiedName.equals(other.lastModifiedName))
			return false;
		if (collectionDefinitionVersion == null) {
			if (other.collectionDefinitionVersion != null)
				return false;
		} else if (!collectionDefinitionVersion.equals(other.collectionDefinitionVersion))
			return false;
		
		return true;
		
	}

	@Override
	public String toString() {
		return "CollectionData [id=" + id + ", collectionDefinitionId=" + collectionDefinitionId + ", customerId="
				+ customerId + ", tenantId=" + tenantId + ", roleName=" + roleName + ", tenantName=" + tenantName + ", viewData=" + Arrays.toString(viewData) + ", subjectDataId="
				+ subjectDataId + ", archive=" + archive + ", status=" + status + ", dataRevisionId=" + dataRevisionId
				+ ", lastModifiedDate=" + lastModifiedDate + ", lastModifiedBy=" + lastModifiedBy + ", lastModifiedName=" + lastModifiedName + ", collectionDefinitionVersion=" + collectionDefinitionVersion + ", version="
				+ version + ", lockedPermission=" + lockedPermission + ", lockedBy=" + lockedBy +", lastLockedDate="+ lastLockedDate + ", versionStatus="
				+ versionStatus + "]";
	}

}
