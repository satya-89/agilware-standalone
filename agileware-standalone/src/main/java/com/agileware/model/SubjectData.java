package com.agileware.model;

import java.util.Arrays;

import javax.persistence.Transient;

import org.json.simple.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "subject_data")
public class SubjectData {

	@Id
	private String id;
	@Indexed (name ="subjectDataIdIndex")
	private String subjectId;
	private String tenantId;
	private String customerId;
	private String roleName;
	private String tenantName;
	private JSONObject[] viewData;
	private JSONObject subjectUserAccess;
	private boolean archive = false;
	private String dataRevisionId;
	private Long lastModifiedDate;
	private String lastModifiedBy;
	private String lastModifiedName;
	private Long lastLockedDate;
	private String version;
	
	private String lockedBy;
	private boolean lockedPermission;
	
	private boolean versionStatus;
	
	private boolean scanditListAccess;
	
	@Transient
	private String actionType;

	public SubjectData() {
		super();
	}
	

	public SubjectData(SubjectData subjectData) {
		super();
		this.id = subjectData.getId();
		this.subjectId = subjectData.getSubjectId();
		this.tenantId = subjectData.getTenantId();
		this.customerId = subjectData.getCustomerId();
		this.roleName = subjectData.getRoleName();
		this.tenantName = subjectData.getTenantName();
		this.viewData = subjectData.getViewData();
		this.subjectUserAccess = subjectData.getSubjectUserAccess();
		this.archive = subjectData.isArchive();
		this.dataRevisionId = subjectData.getDataRevisionId();
		this.lastModifiedDate = subjectData.getLastModifiedDate();
		this.lastModifiedBy = subjectData.getLastModifiedBy();
		this.lastModifiedName = subjectData.getLastModifiedName();
		this.lastLockedDate = subjectData.getLastLockedDate();
		this.version = subjectData.getVersion();
		this.lockedBy = subjectData.getLockedBy();
	    this.lockedPermission = subjectData.isLockedPermission();
	    this.versionStatus  =subjectData.isVersionStatus();
	    this.scanditListAccess  =subjectData.isScanditListAccess();
	    
	    
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public JSONObject[] getViewData() {
		return viewData;
	}

	public void setViewData(JSONObject[] viewData) {
		this.viewData = viewData;
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

	public JSONObject getSubjectUserAccess() {
		return subjectUserAccess;
	}
	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public void setSubjectUserAccess(JSONObject subjectUserAccess) {
		this.subjectUserAccess = subjectUserAccess;
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
 	public boolean isScanditListAccess() {
		return scanditListAccess;
	}

	public void setScanditListAccess(boolean scanditListAccess) {
		this.scanditListAccess = scanditListAccess;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (archive ? 1231 : 1237);
		result = prime * result + (lockedPermission ? 1231 : 1237);
		result = prime * result + (scanditListAccess ? 1231 : 1237);
		result = prime * result + ((dataRevisionId == null) ? 0 : dataRevisionId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastModifiedBy == null) ? 0 : lastModifiedBy.hashCode());
		result = prime * result + ((lastModifiedName == null) ? 0 : lastModifiedName.hashCode());
		result = prime * result + ((lastModifiedDate == null) ? 0 : lastModifiedDate.hashCode());
		result = prime * result + ((subjectId == null) ? 0 : subjectId.hashCode());
		result = prime * result + ((tenantId == null) ? 0 : tenantId.hashCode());
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
		result = prime * result + ((tenantName == null) ? 0 : tenantName.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		result = prime * result + Arrays.hashCode(viewData);
		result = prime * result + ((subjectUserAccess == null) ? 0 : subjectUserAccess.hashCode());
		result = prime * result + ((lockedBy == null) ? 0 : lockedBy.hashCode());
		result = prime * result + ((lastLockedDate == null) ? 0 : lastLockedDate.hashCode());
		result = prime * result + (versionStatus ? 1231 : 1237);
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
		SubjectData other = (SubjectData) obj;
		if (archive != other.archive)
			return false;
		if (versionStatus != other.versionStatus)
			return false;
		if (lockedPermission != other.lockedPermission)
			return false;
		if (scanditListAccess != other.scanditListAccess)
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
		if (subjectId == null) {
			if (other.subjectId != null)
				return false;
		} else if (!subjectId.equals(other.subjectId))
			return false;
		if (tenantId == null) {
			if (other.tenantId != null)
				return false;
		} else if (!tenantId.equals(other.tenantId))
			return false;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
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
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		if (subjectUserAccess == null) {
			if (other.subjectUserAccess != null)
				return false;
		} else if (!subjectUserAccess.equals(other.subjectUserAccess))
			return false;
		if (lockedBy == null) {
			if (other.lockedBy != null)
				return false;
		} else if (!lockedBy.equals(other.lockedBy))
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
		if (!Arrays.equals(viewData, other.viewData))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SubjectData [id=" + id + ", subjectId=" + subjectId + ", tenantId=" + tenantId + ", customerId="
				+ customerId + ", roleName=" + roleName + ", tenantName=" + tenantName + ", viewData=" + Arrays.toString(viewData)
				+ ", subjectUserAccess=" + subjectUserAccess + ", archive=" + archive + ", dataRevisionId="
				+ dataRevisionId + ", lastModifiedDate=" + lastModifiedDate + ", lastModifiedBy=" + lastModifiedBy + ", lastModifiedName=" + lastModifiedName
				+", lastLockedDate="+ lastLockedDate + ", version=" + version + ", lockedPermission=" + lockedPermission + ",scanditListAccess=" + scanditListAccess + ", lockedBy=" + lockedBy 
				+ ", versionStatus=" + versionStatus + "]";
	}

}
