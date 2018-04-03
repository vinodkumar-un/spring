package com.qa.bo;

import java.util.List;

public class ProjectResourcesBo extends ProjectBo {
	private List<ResourceBo> resources;

	public List<ResourceBo> getResources() {
		return resources;
	}

	public void setResources(List<ResourceBo> resources) {
		this.resources = resources;
	}

	@Override
	public String toString() {
		return "ProjectResourcesBo [resources=" + resources + ", projectNo="
				+ projectNo + ", title=" + title + ", description="
				+ description + ", duration=" + duration + ", status=" + status
				+ "]";
	}

}
